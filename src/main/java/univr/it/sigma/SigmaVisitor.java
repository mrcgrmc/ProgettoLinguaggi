// Generated from /home/bong/Projects/ProgettoLinguaggi/src/main/java/univr/it/Sigma.g4 by ANTLR 4.13.2
package univr.it.sigma;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SigmaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SigmaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SigmaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SigmaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SigmaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SigmaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SigmaParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(SigmaParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SigmaParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(SigmaParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(SigmaParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(SigmaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(SigmaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunStmt(SigmaParser.FunStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(SigmaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecStmt(SigmaParser.DecStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reDecStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReDecStmt(SigmaParser.ReDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnSStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSStmt(SigmaParser.ReturnSStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFStmt(SigmaParser.ReturnFStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ndStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNdStmt(SigmaParser.NdStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bfStmt}
	 * labeled alternative in {@link SigmaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfStmt(SigmaParser.BfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decString}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecString(SigmaParser.DecStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decFloat}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFloat(SigmaParser.DecFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decArray}
	 * labeled alternative in {@link SigmaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecArray(SigmaParser.DecArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVar(SigmaParser.ArrayVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFloat}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFloat(SigmaParser.ArrayFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link SigmaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayString(SigmaParser.ArrayStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bPar}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBPar(SigmaParser.BParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SigmaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SigmaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCompare(SigmaParser.SCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SigmaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fCompare}
	 * labeled alternative in {@link SigmaParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCompare(SigmaParser.FCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sAtom}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSAtom(SigmaParser.SAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(SigmaParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatToString}
	 * labeled alternative in {@link SigmaParser#sExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatToString(SigmaParser.FloatToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sVar}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSVar(SigmaParser.SVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SigmaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sInput}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSInput(SigmaParser.SInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sReturn}
	 * labeled alternative in {@link SigmaParser#sAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSReturn(SigmaParser.SReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(SigmaParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(SigmaParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPar}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPar(SigmaParser.FParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fAtom}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAtom(SigmaParser.FAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link SigmaParser#fExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(SigmaParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fVar}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVar(SigmaParser.FVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numbers}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbers(SigmaParser.NumbersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fInput}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFInput(SigmaParser.FInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fReturn}
	 * labeled alternative in {@link SigmaParser#fAtoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFReturn(SigmaParser.FReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(SigmaParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(SigmaParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(SigmaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(SigmaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(SigmaParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(SigmaParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(SigmaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link SigmaParser#bfComm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(SigmaParser.NilContext ctx);
}