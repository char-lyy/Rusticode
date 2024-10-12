// Generated from C:/Users/Evelin Suarez/OneDrive/Desktop/Estudio/repoRusti/Rusticode/src/antlr/Simple.g4 by ANTLR 4.13.1
package language;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link SimpleParser#exp_mat}.
	 * @param ctx the parse tree
	 */
	void enterExp_mat(SimpleParser.Exp_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exp_mat}.
	 * @param ctx the parse tree
	 */
	void exitExp_mat(SimpleParser.Exp_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(SimpleParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(SimpleParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SimpleParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SimpleParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#exp_log}.
	 * @param ctx the parse tree
	 */
	void enterExp_log(SimpleParser.Exp_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exp_log}.
	 * @param ctx the parse tree
	 */
	void exitExp_log(SimpleParser.Exp_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentence(SimpleParser.If_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentence(SimpleParser.If_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sentence(SimpleParser.While_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sentence(SimpleParser.While_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SimpleParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SimpleParser.Literal_valueContext ctx);
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