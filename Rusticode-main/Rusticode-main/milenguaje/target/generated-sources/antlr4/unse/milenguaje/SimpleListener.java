// Generated from unse\milenguaje\Simple.g4 by ANTLR 4.5.1
package unse.milenguaje;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#inicio_fin}.
	 * @param ctx the parse tree
	 */
	void enterInicio_fin(SimpleParser.Inicio_finContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#inicio_fin}.
	 * @param ctx the parse tree
	 */
	void exitInicio_fin(SimpleParser.Inicio_finContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SimpleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SimpleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(SimpleParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(SimpleParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentencia(SimpleParser.If_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentencia(SimpleParser.If_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sentencia(SimpleParser.While_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sentencia(SimpleParser.While_sentenciaContext ctx);
}