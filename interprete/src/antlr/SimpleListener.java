// Generated from unse\milenguaje\Simple.g4 by ANTLR 4.5.1
package unse.milenguaje;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleParser.StartContext ctx);
}