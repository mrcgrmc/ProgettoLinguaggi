package univr.it;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import univr.it.sigma.SigmaBaseVisitor;
import univr.it.sigma.SigmaParser;
import univr.it.value.*;

import java.util.*;

public class IntSigma extends SigmaBaseVisitor<Value>{
    private final Conf global;
    private Conf scope;
    private final Scanner in = new Scanner(System.in);
    private final Map<String, FuncDef> functions = new HashMap<>();

    public IntSigma(Conf conf){
        this.global = conf;
        this.scope = conf;
    }

    //MAIN
    @Override
    public StmtValue visitMain(SigmaParser.MainContext ctx) {
        for (SigmaParser.FuncDefContext fun: ctx.funcDef()){
            visitFuncDef(fun);
        }
        visit(ctx.block());
        return StmtValue.INSTANCE;
    }


    //BLOCKS
    @Override
    public StmtValue visitBlock(SigmaParser.BlockContext ctx) {
        Conf old;
        old = this.scope;
        this.scope = new Conf(old);
        for(SigmaParser.StatementContext stmt : ctx.statement()){
            visit(stmt);
        }
        this.scope = old;
        return StmtValue.INSTANCE;
    }


    //FUNCTIONS
    @Override
    public StmtValue visitFuncDef(SigmaParser.FuncDefContext ctx) {
        String name = ctx.ID(0).getText();
        List<String> params = new ArrayList<>();

        for(int i=1;i<ctx.ID().size();i++){
            params.add(ctx.ID(i).getText());
        }
        functions.put(name, new FuncDef(params,ctx.block()));
        return StmtValue.INSTANCE;
    }
    @Override
    public ExpValue visitFunCall(SigmaParser.FunCallContext ctx) {
        FuncDef def = functions.get(ctx.ID().getText());
        Conf old = this.scope;
        this.scope = new Conf();
        if (def == null) {
            System.err.println("Error: not defined function!");
            System.exit(1);
        }
        List<Value> argValues = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof SigmaParser.FExpContext) {
                argValues.add(visit(child));
            } else if (child instanceof SigmaParser.SExpContext) {
                argValues.add(visit(child));
            }
        }
        if (argValues.size() != def.getParamNames().size()) {
            System.err.print("Error: wrong argument size");
            System.exit(1);
        }

        for (int i = 0; i < def.getParamNames().size(); i++) {
            String pname = def.getParamNames().get(i);
            ExpValue v = (ExpValue) argValues.get(i);
            scope.put(pname, v);
        }
        visit(def.getBody());
        ExpValue ret = (ExpValue) this.global.get("ret");
        this.global.delete("ret");
        this.scope = old;
        return ret;
    }


    //STATEMENTS
    @Override
    public StmtValue visitBfStmt(SigmaParser.BfStmtContext ctx) {
        IntBrainFuck.run(ctx.bfComm());
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitNdStmt(SigmaParser.NdStmtContext ctx) {
        Random r = new Random();
        int choice = r.nextInt(2);
        visit(ctx.block(choice));
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitReDecStmt(SigmaParser.ReDecStmtContext ctx) {

        String id   = ctx.ID().getText();
        Value  old  = scope.get(id);
        if (old == null)
            throw new RuntimeException("Variable '" + id + "' used but never declared");

        boolean hasIndex = ctx.LSPAR() != null;

        if (hasIndex) {
            if (!(old instanceof ArrayValue arr))
                throw new RuntimeException("Error: Variable '" + id + "' is not an array");

            int idx = ((FloatValue) visit(ctx.fExp(0))).toInt().getValue();

            Value newVal;
            if (ctx.sExp() != null) {
                newVal = visit(ctx.sExp());
            } else {
                newVal = visit(ctx.fExp(1));
            }
            arr.set(idx, (ExpValue) newVal);
            return StmtValue.INSTANCE;
        }

        if (ctx.sExp() != null) {
            StringValue sv = (StringValue) visit(ctx.sExp());
            if (old instanceof FloatValue) {
                try {
                    float num = Float.parseFloat(sv.getValue());
                    scope.put(id, new FloatValue(num));
                } catch (NumberFormatException ex) {
                    throw new RuntimeException(
                            "Error: Cannot convert \"" + sv.getValue() +
                                    "\" to FLOAT for variable '" + id + "'");
                }
            } else {
                scope.put(id, sv);
            }
            return StmtValue.INSTANCE;
        }

        FloatValue fv = (FloatValue) visit(ctx.fExp(0));
        scope.put(id, fv);
        return StmtValue.INSTANCE;
    }

    @Override
    public StmtValue visitReturnSStmt(SigmaParser.ReturnSStmtContext ctx) {
        ParserRuleContext parent = ctx.getParent().getParent();
        if(parent instanceof SigmaParser.FuncDefContext){
            global.put("ret",visit(ctx.sExp()));
        }
        else if (parent instanceof SigmaParser.MainContext){
            System.out.println(((StringValue)visit(ctx.sExp())).getValue());
            System.exit(0);
        }
        else throw new IllegalStateException("Error: Illegal return statement!");
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitReturnFStmt(SigmaParser.ReturnFStmtContext ctx) {
        ParserRuleContext parent = ctx.getParent().getParent();
        if(parent instanceof SigmaParser.FuncDefContext){
            global.put("ret",visit(ctx.fExp()));
        }
        else if (parent instanceof SigmaParser.MainContext){
            System.out.println(((FloatValue)visit(ctx.fExp())).getValue());
            System.exit(0);
        }
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitDecStmt(SigmaParser.DecStmtContext ctx) {
        visit(ctx.declaration());
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitPrintStmt(SigmaParser.PrintStmtContext ctx) {
        System.out.println(((StringValue)visit(ctx.sExp())).getValue());
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitFunStmt(SigmaParser.FunStmtContext ctx) {
        visit(ctx.funCall());
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitForStmt(SigmaParser.ForStmtContext ctx) {
        int start,end;
        if (ctx.fExp().size() > 1){
            start = ((FloatValue) visit(ctx.fExp(0))).toInt().getValue();
            end = ((FloatValue) visit(ctx.fExp(1))).toInt().getValue();
        }else{
            start = 0;
            end = ((FloatValue) visit(ctx.fExp(0))).toInt().getValue();
        }
        for(int i=start;i<end;i++){
            scope.put(ctx.ID().getText(),new FloatValue((float)i));
            visit(ctx.block());
            i = ((FloatValue)scope.get(ctx.ID().getText())).toInt().getValue();
        }
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitWhileStmt(SigmaParser.WhileStmtContext ctx) {
        boolean cond = ((BoolValue)visit(ctx.bExp())).getValue();
        while(cond){
            visit(ctx.block());
            cond = ((BoolValue)visit(ctx.bExp())).getValue();
        }
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitIfElseStmt(SigmaParser.IfElseStmtContext ctx) {
        boolean cond = ((BoolValue)visit(ctx.bExp())).getValue();
        if(cond) visit(ctx.block(0));
        else if (ctx.ELSE() != null) visit(ctx.block(1));
        return StmtValue.INSTANCE;
    }


    //DECLARATIONS
    @Override
    public StmtValue visitDecArray(SigmaParser.DecArrayContext ctx) {
        scope.put(ctx.ID().getText(), visit(ctx.array()));
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitDecFloat(SigmaParser.DecFloatContext ctx) {
        scope.put(ctx.ID().getText(), visit(ctx.fExp()));
        return StmtValue.INSTANCE;
    }
    @Override
    public StmtValue visitDecString(SigmaParser.DecStringContext ctx) {
        scope.put(ctx.ID().getText(), visit(ctx.sExp()));
        return StmtValue.INSTANCE;
    }


    //ARRAYS
    @Override
    public ArrayValue visitArrayString(SigmaParser.ArrayStringContext ctx) {
        ArrayValue list = new ArrayValue(new ArrayList<>());
        int i = 0;
        for (SigmaParser.SExpContext se : ctx.sExp()){
            list.set(i,(StringValue) visit(se));
            i++;
        }
        return list;
    }
    @Override
    public ArrayValue visitArrayFloat(SigmaParser.ArrayFloatContext ctx) {
        ArrayValue list = new ArrayValue(new ArrayList<>());
        int i = 0;
        for (SigmaParser.FExpContext fe : ctx.fExp()){
            list.set(i,(FloatValue) visit(fe));
            i++;
        }
        return list;
    }
    @Override
    public ArrayValue visitArrayVar(SigmaParser.ArrayVarContext ctx) {
        if(scope.get(ctx.ID().getText()) == null){
            System.err.println("Error: Variable " + ctx.ID().getText() +  "used never assigned");
            System.exit(1);
        }
        return (ArrayValue) scope.get(ctx.ID().getText());
    }


    //BOOLEANS EXPRESSIONS
    @Override
    public BoolValue visitOr(SigmaParser.OrContext ctx) {
        boolean left = ((BoolValue) visit(ctx.bExp(0))).getValue();
        boolean right = ((BoolValue) visit(ctx.bExp(1))).getValue();
        return new BoolValue(left || right);
    }
    @Override
    public BoolValue visitAnd(SigmaParser.AndContext ctx) {
        boolean left = ((BoolValue) visit(ctx.bExp(0))).getValue();
        boolean right = ((BoolValue) visit(ctx.bExp(1))).getValue();
        return new BoolValue(left && right);
    }
    @Override
    public BoolValue visitNot(SigmaParser.NotContext ctx) {
        return new BoolValue(!((BoolValue) visit(ctx.bExp())).getValue());
    }
    @Override
    public BoolValue visitBPar(SigmaParser.BParContext ctx) {
        return (BoolValue) visit(ctx.bExp());
    }
    @Override
    public BoolValue visitFCompare(SigmaParser.FCompareContext ctx) {
        float left = ((FloatValue)visit(ctx.fExp(0))).getValue();
        float right = ((FloatValue)visit(ctx.fExp(1))).getValue();
        return switch (ctx.op.getType()) {
            case SigmaParser.EQ -> new BoolValue(left == right);
            case SigmaParser.LT -> new BoolValue(left < right);
            case SigmaParser.GT -> new BoolValue(left > right);
            case SigmaParser.LE -> new BoolValue(left <= right);
            case SigmaParser.GE -> new BoolValue(left >= right);
            default -> null;
        };
    }
    @Override
    public BoolValue visitSCompare(SigmaParser.SCompareContext ctx) {
        String left = ((StringValue) visit(ctx.sExp(0))).getValue();
        String right = ((StringValue) visit(ctx.sExp(1))).getValue();
        return new BoolValue(left.equals(right));
    }


    //STRINGS EXPRESSIONS
    @Override
    public StringValue visitFloatToString(SigmaParser.FloatToStringContext ctx) {
        return new StringValue(visit(ctx.fExp()).toString());
    }
    @Override
    public StringValue visitConcat(SigmaParser.ConcatContext ctx) {
        String left = ((StringValue) visit(ctx.sExp(0))).getValue();
        String right = ((StringValue) visit(ctx.sExp(1))).getValue();
        return new StringValue(left+right);
    }
    @Override
    public StringValue visitSAtom(SigmaParser.SAtomContext ctx) {
        return (StringValue) visit(ctx.sAtoms());
    }


    //STRINGS ATOMS
    @Override
    public StringValue visitSReturn(SigmaParser.SReturnContext ctx) {
        return (StringValue) visit(ctx.funCall());
    }
    @Override
    public StringValue visitSInput(SigmaParser.SInputContext ctx) {
        try {
            String val = in.nextLine();
            return new StringValue(val);
        }catch (Exception e){
            System.err.println("Type missmatch exception!");
            System.exit(1);
        }
        return null;
    }
    @Override
    public StringValue visitString(SigmaParser.StringContext ctx) {
        String raw = ctx.STRING().getText();
        return new StringValue(raw.substring(1,raw.length()-1));
    }
    public StringValue visitSVar(SigmaParser.SVarContext ctx) {
        if(scope.get(ctx.ID().getText()) == null){
            System.err.println("Variable " + ctx.ID().getText() +  "used but never assigned");
            System.exit(1);
        }
        if (ctx.LSPAR() != null)
            return (StringValue) ((ArrayValue)scope.get(ctx.ID().getText())).get(((FloatValue)visit(ctx.fExp())).toInt().getValue());

        return (StringValue) scope.get(ctx.ID().getText());
    }


    //FLOAT EXPRESSIONS
    @Override
    public Value visitPlusMinus(SigmaParser.PlusMinusContext ctx) {
        float left = ((FloatValue)visit(ctx.fExp(0))).getValue();
        float right = ((FloatValue)visit(ctx.fExp(1))).getValue();
        return switch (ctx.op.getType()) {
            case SigmaParser.PLUS -> new FloatValue(left + right);
            case SigmaParser.MINUS -> new FloatValue(left - right);
            default -> null;
        };
    }
    @Override
    public FloatValue visitMulDivMod(SigmaParser.MulDivModContext ctx) {
        float left = ((FloatValue)visit(ctx.fExp(0))).getValue();
        float right = ((FloatValue)visit(ctx.fExp(1))).getValue();
        return switch (ctx.op.getType()) {
            case SigmaParser.MUL -> new FloatValue(left * right);
            case SigmaParser.DIV -> new FloatValue(left / right);
            case SigmaParser.MOD -> new FloatValue(left % right);
            default -> null;
        };
    }
    @Override
    public FloatValue visitPower(SigmaParser.PowerContext ctx) {
        float base = ((FloatValue)visit(ctx.fExp(0))).getValue();
        float exp = ((FloatValue)visit(ctx.fExp(1))).getValue();
        return new FloatValue((float) Math.pow(base,exp));
    }
    @Override
    public FloatValue visitFPar(SigmaParser.FParContext ctx) {
        return (FloatValue) visit(ctx.fExp());
    }
    @Override
    public FloatValue visitFAtom(SigmaParser.FAtomContext ctx) {
        return (FloatValue) visit(ctx.fAtoms());
    }

    //FLOATS ATOMS
    @Override
    public FloatValue visitFReturn(SigmaParser.FReturnContext ctx) {
        return (FloatValue) visit(ctx.funCall());
    }

    @Override
    public FloatValue visitFInput(SigmaParser.FInputContext ctx) {
        try {
            Float val = in.nextFloat();
            in.nextLine();
            return new FloatValue(val);
        } catch (Exception e) {
            System.err.println("Type mismatch exception!");
            System.exit(1);
        }
        return null;
    }
    @Override
    public FloatValue visitNumbers(SigmaParser.NumbersContext ctx) {
        String txt = ctx.getText();
        float v = txt.contains(".")
                ? Float.parseFloat(txt)
                : Integer.parseInt(txt);
        return new FloatValue(v);
    }
    @Override
    public FloatValue visitFVar(SigmaParser.FVarContext ctx) {
        String name = ctx.ID().getText();
        Value raw = scope.get(name);

        if (raw == null) {
            throw new RuntimeException("Error: Undefined variable " + name);
        }
        if (ctx.fExp() != null) {
            int idx = ((FloatValue)visit(ctx.fExp())).toInt().getValue();
            if (!(raw instanceof ArrayValue)) {
                throw new RuntimeException("Variable " + name + " is not an array");
            }
            raw = ((ArrayValue) raw).get(idx);
        }
        if (raw instanceof FloatValue) {
            return (FloatValue) raw;
        }
        if (raw instanceof IntValue) {
            float v = ((IntValue) raw).getValue();
            return new FloatValue(v);
        }
        throw new RuntimeException(
                "Error: Variable " + name + " is not numeric, but " + raw.getClass().getSimpleName());
    }
}


