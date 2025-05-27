// Generated from /home/bong/Projects/ProgettoLinguaggi/src/main/java/univr/it/Sigma.g4 by ANTLR 4.13.2
package univr.it.sigma;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SigmaParser}.
 */
public interface SigmaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SigmaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SigmaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SigmaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SigmaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SigmaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SigmaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SigmaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SigmaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SigmaParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(SigmaParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SigmaParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(SigmaParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SigmaParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(SigmaParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SigmaParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(SigmaParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(SigmaParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(SigmaParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(SigmaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(SigmaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(SigmaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(SigmaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunStmt(SigmaParser.FunStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunStmt(SigmaParser.FunStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SigmaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SigmaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecStmt(SigmaParser.DecStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecStmt(SigmaParser.DecStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reDecStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReDecStmt(SigmaParser.ReDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reDecStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReDecStmt(SigmaParser.ReDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ndStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNdStmt(SigmaParser.NdStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ndStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNdStmt(SigmaParser.NdStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bfStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBfStmt(SigmaParser.BfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bfStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBfStmt(SigmaParser.BfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decString}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDecString(SigmaParser.DecStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decString}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDecString(SigmaParser.DecStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decFloat}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDecFloat(SigmaParser.DecFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decFloat}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDecFloat(SigmaParser.DecFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decArray}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDecArray(SigmaParser.DecArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decArray}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDecArray(SigmaParser.DecArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayVar(SigmaParser.ArrayVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayVar(SigmaParser.ArrayVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayFloat}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayFloat(SigmaParser.ArrayFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayFloat}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayFloat(SigmaParser.ArrayFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayString(SigmaParser.ArrayStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayString(SigmaParser.ArrayStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bPar}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterBPar(SigmaParser.BParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bPar}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitBPar(SigmaParser.BParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterNot(SigmaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitNot(SigmaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterOr(SigmaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitOr(SigmaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterSCompare(SigmaParser.SCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitSCompare(SigmaParser.SCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(SigmaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(SigmaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterFCompare(SigmaParser.FCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitFCompare(SigmaParser.FCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sAtom}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void enterSAtom(SigmaParser.SAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sAtom}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void exitSAtom(SigmaParser.SAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void enterConcat(SigmaParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void exitConcat(SigmaParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatToString}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void enterFloatToString(SigmaParser.FloatToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatToString}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 */
	void exitFloatToString(SigmaParser.FloatToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sVar}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void enterSVar(SigmaParser.SVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sVar}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void exitSVar(SigmaParser.SVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void enterString(SigmaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void exitString(SigmaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sInput}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void enterSInput(SigmaParser.SInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sInput}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void exitSInput(SigmaParser.SInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sReturn}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void enterSReturn(SigmaParser.SReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sReturn}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 */
	void exitSReturn(SigmaParser.SReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(SigmaParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(SigmaParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(SigmaParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(SigmaParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fPar}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterFPar(SigmaParser.FParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fPar}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitFPar(SigmaParser.FParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fAtom}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterFAtom(SigmaParser.FAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fAtom}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitFAtom(SigmaParser.FAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterPower(SigmaParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitPower(SigmaParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fVar}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void enterFVar(SigmaParser.FVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fVar}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void exitFVar(SigmaParser.FVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numbers}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(SigmaParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numbers}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(SigmaParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fInput}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void enterFInput(SigmaParser.FInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fInput}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void exitFInput(SigmaParser.FInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fReturn}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void enterFReturn(SigmaParser.FReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fReturn}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 */
	void exitFReturn(SigmaParser.FReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterLt(SigmaParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitLt(SigmaParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterGt(SigmaParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitGt(SigmaParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterPlus(SigmaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitPlus(SigmaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterMinus(SigmaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitMinus(SigmaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterDot(SigmaParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitDot(SigmaParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comma}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterComma(SigmaParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitComma(SigmaParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SigmaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SigmaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nil}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void enterNil(SigmaParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 */
	void exitNil(SigmaParser.NilContext ctx);
}