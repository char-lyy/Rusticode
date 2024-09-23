// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
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
	void enterInicio_fin(@NotNull SimpleParser.Inicio_finContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#inicio_fin}.
	 * @param ctx the parse tree
	 */
	void exitInicio_fin(@NotNull SimpleParser.Inicio_finContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull SimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull SimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(@NotNull SimpleParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(@NotNull SimpleParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sentencia(@NotNull SimpleParser.While_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sentencia(@NotNull SimpleParser.While_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull SimpleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull SimpleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentencia(@NotNull SimpleParser.If_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentencia(@NotNull SimpleParser.If_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull SimpleParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull SimpleParser.SentenciaContext ctx);
}