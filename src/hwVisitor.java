// Generated from hw.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hwParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hwVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hwParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(hwParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link hwParser#latchdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchdecl(hwParser.LatchdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hwParser#updatedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatedecl(hwParser.UpdatedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hwParser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimInp(hwParser.SimInpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(hwParser.SignalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(hwParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(hwParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(hwParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link hwParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(hwParser.ConjunctionContext ctx);
}