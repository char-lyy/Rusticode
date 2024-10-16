// Generated from C:/Users/Evelin Suarez/OneDrive/Desktop/Estudio/repoR/src/main/antlr4/Rusticode.g4 by ANTLR 4.13.1
package language;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RusticodeParser}.
 */
public interface RusticodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RusticodeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RusticodeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(RusticodeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(RusticodeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(RusticodeParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(RusticodeParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_type(RusticodeParser.Const_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_type(RusticodeParser.Const_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RusticodeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RusticodeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#exp_mat}.
	 * @param ctx the parse tree
	 */
	void enterExp_mat(RusticodeParser.Exp_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#exp_mat}.
	 * @param ctx the parse tree
	 */
	void exitExp_mat(RusticodeParser.Exp_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(RusticodeParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(RusticodeParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(RusticodeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(RusticodeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(RusticodeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(RusticodeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#exp_log}.
	 * @param ctx the parse tree
	 */
	void enterExp_log(RusticodeParser.Exp_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#exp_log}.
	 * @param ctx the parse tree
	 */
	void exitExp_log(RusticodeParser.Exp_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(RusticodeParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(RusticodeParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentence(RusticodeParser.If_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentence(RusticodeParser.If_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sentence(RusticodeParser.While_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sentence(RusticodeParser.While_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RusticodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RusticodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(RusticodeParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(RusticodeParser.Literal_valueContext ctx);
}