// Generated from hw.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hwParser}.
 */
public interface hwListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hwParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(hwParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link hwParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(hwParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link hwParser#latchdecl}.
	 * @param ctx the parse tree
	 */
	void enterLatchdecl(hwParser.LatchdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hwParser#latchdecl}.
	 * @param ctx the parse tree
	 */
	void exitLatchdecl(hwParser.LatchdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hwParser#updatedecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedecl(hwParser.UpdatedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hwParser#updatedecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedecl(hwParser.UpdatedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hwParser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimInp(hwParser.SimInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link hwParser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimInp(hwParser.SimInpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignal(hwParser.SignalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignal(hwParser.SignalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(hwParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(hwParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(hwParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(hwParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(hwParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(hwParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(hwParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(hwParser.ConjunctionContext ctx);
}