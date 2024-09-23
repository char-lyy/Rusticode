// Generated from unse\milenguaje\Simple.g4 by ANTLR 4.5.1
package unse.milenguaje;
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
	 * Visit a parse tree produced by {@link SimpleParser#inicio_fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio_fin(SimpleParser.Inicio_finContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleParser#if_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentencia(SimpleParser.If_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#while_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sentencia(SimpleParser.While_sentenciaContext ctx);
}