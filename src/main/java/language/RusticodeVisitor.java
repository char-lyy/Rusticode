package language;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RusticodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RusticodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RusticodeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(RusticodeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(RusticodeParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RusticodeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#exp_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_mat(RusticodeParser.Exp_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(RusticodeParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(RusticodeParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(RusticodeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#exp_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_log(RusticodeParser.Exp_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentence(RusticodeParser.If_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#while_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sentence(RusticodeParser.While_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RusticodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(RusticodeParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(RusticodeParser.StartContext ctx);
}