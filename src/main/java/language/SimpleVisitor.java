// Generated from C:/Users/Evelin Suarez/OneDrive/Desktop/Estudio/Rusticode/src/main/antlr/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SimpleParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(SimpleParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#exp_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_mat(SimpleParser.Exp_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(SimpleParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SimpleParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#exp_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_log(SimpleParser.Exp_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentence(SimpleParser.If_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#while_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sentence(SimpleParser.While_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SimpleParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleParser.StartContext ctx);
}