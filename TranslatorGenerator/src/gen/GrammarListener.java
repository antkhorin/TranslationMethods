// Generated from C:/MyProgram/MethodsOfTranslation/Translator generator/src\Grammar.g4 by ANTLR 4.7
package gen;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(GrammarParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(GrammarParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rul}.
	 * @param ctx the parse tree
	 */
	void enterRul(GrammarParser.RulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rul}.
	 * @param ctx the parse tree
	 */
	void exitRul(GrammarParser.RulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(GrammarParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(GrammarParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nterm}.
	 * @param ctx the parse tree
	 */
	void enterNterm(GrammarParser.NtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nterm}.
	 * @param ctx the parse tree
	 */
	void exitNterm(GrammarParser.NtermContext ctx);
}