// Generated from C:/MyProgram/MethodsOfTranslation/ANTLRparser/src\Grammar.g4 by ANTLR 4.7
package gen;

import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pack}.
	 * @param ctx the parse tree
	 */
	void enterPack(GrammarParser.PackContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pack}.
	 * @param ctx the parse tree
	 */
	void exitPack(GrammarParser.PackContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(GrammarParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(GrammarParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#clas}.
	 * @param ctx the parse tree
	 */
	void enterClas(GrammarParser.ClasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#clas}.
	 * @param ctx the parse tree
	 */
	void exitClas(GrammarParser.ClasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inclas}.
	 * @param ctx the parse tree
	 */
	void enterInclas(GrammarParser.InclasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inclas}.
	 * @param ctx the parse tree
	 */
	void exitInclas(GrammarParser.InclasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#voidtype}.
	 * @param ctx the parse tree
	 */
	void enterVoidtype(GrammarParser.VoidtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#voidtype}.
	 * @param ctx the parse tree
	 */
	void exitVoidtype(GrammarParser.VoidtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(GrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(GrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(GrammarParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(GrammarParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whil}.
	 * @param ctx the parse tree
	 */
	void enterWhil(GrammarParser.WhilContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whil}.
	 * @param ctx the parse tree
	 */
	void exitWhil(GrammarParser.WhilContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(GrammarParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(GrammarParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inttype}.
	 * @param ctx the parse tree
	 */
	void enterInttype(GrammarParser.InttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inttype}.
	 * @param ctx the parse tree
	 */
	void exitInttype(GrammarParser.InttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intr}.
	 * @param ctx the parse tree
	 */
	void enterIntr(GrammarParser.IntrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intr}.
	 * @param ctx the parse tree
	 */
	void exitIntr(GrammarParser.IntrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void enterIntexpr(GrammarParser.IntexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void exitIntexpr(GrammarParser.IntexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intterm}.
	 * @param ctx the parse tree
	 */
	void enterIntterm(GrammarParser.InttermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intterm}.
	 * @param ctx the parse tree
	 */
	void exitIntterm(GrammarParser.InttermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void enterIntvalue(GrammarParser.IntvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void exitIntvalue(GrammarParser.IntvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(GrammarParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(GrammarParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(GrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(GrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unminus}.
	 * @param ctx the parse tree
	 */
	void enterUnminus(GrammarParser.UnminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unminus}.
	 * @param ctx the parse tree
	 */
	void exitUnminus(GrammarParser.UnminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#booltype}.
	 * @param ctx the parse tree
	 */
	void enterBooltype(GrammarParser.BooltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#booltype}.
	 * @param ctx the parse tree
	 */
	void exitBooltype(GrammarParser.BooltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolr}.
	 * @param ctx the parse tree
	 */
	void enterBoolr(GrammarParser.BoolrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolr}.
	 * @param ctx the parse tree
	 */
	void exitBoolr(GrammarParser.BoolrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(GrammarParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(GrammarParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void enterBoolterm(GrammarParser.BooltermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void exitBoolterm(GrammarParser.BooltermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolvalue}.
	 * @param ctx the parse tree
	 */
	void enterBoolvalue(GrammarParser.BoolvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolvalue}.
	 * @param ctx the parse tree
	 */
	void exitBoolvalue(GrammarParser.BoolvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(GrammarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(GrammarParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(GrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(GrammarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(GrammarParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(GrammarParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(GrammarParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(GrammarParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(GrammarParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(GrammarParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(GrammarParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(GrammarParser.WordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(GrammarParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(GrammarParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#seq2}.
	 * @param ctx the parse tree
	 */
	void enterSeq2(GrammarParser.Seq2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#seq2}.
	 * @param ctx the parse tree
	 */
	void exitSeq2(GrammarParser.Seq2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(GrammarParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(GrammarParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(GrammarParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(GrammarParser.ExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(GrammarParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(GrammarParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(GrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(GrammarParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ord}.
	 * @param ctx the parse tree
	 */
	void enterOrd(GrammarParser.OrdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ord}.
	 * @param ctx the parse tree
	 */
	void exitOrd(GrammarParser.OrdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lb}.
	 * @param ctx the parse tree
	 */
	void enterLb(GrammarParser.LbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lb}.
	 * @param ctx the parse tree
	 */
	void exitLb(GrammarParser.LbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rb}.
	 * @param ctx the parse tree
	 */
	void enterRb(GrammarParser.RbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rb}.
	 * @param ctx the parse tree
	 */
	void exitRb(GrammarParser.RbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lp}.
	 * @param ctx the parse tree
	 */
	void enterLp(GrammarParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lp}.
	 * @param ctx the parse tree
	 */
	void exitLp(GrammarParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(GrammarParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(GrammarParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tabs}.
	 * @param ctx the parse tree
	 */
	void enterTabs(GrammarParser.TabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tabs}.
	 * @param ctx the parse tree
	 */
	void exitTabs(GrammarParser.TabsContext ctx);
}