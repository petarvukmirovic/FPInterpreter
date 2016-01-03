// Generated from /home/petar/IdeaProjects/FPInterpreter/src/grammar/FPParser.g4 by ANTLR 4.5.1
package matf.petar.FPInterpreter.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FPParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FPParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FPParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FPParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(FPParserParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FPParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructionLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructionLabel(FPParserParser.ConstructionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertLeft}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertLeft(FPParserParser.InsertLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantLabel(FPParserParser.ConstantLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code composition}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposition(FPParserParser.CompositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyAll}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyAll(FPParserParser.ApplyAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalLabel(FPParserParser.ConditionalLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementary}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementary(FPParserParser.ElementaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertRight}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertRight(FPParserParser.InsertRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenths}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenths(FPParserParser.ParenthsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruction(FPParserParser.ConstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(FPParserParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FPParserParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FPParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(FPParserParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tail}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(FPParserParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FPParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(FPParserParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq0}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq0(FPParserParser.Eq0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(FPParserParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(FPParserParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(FPParserParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(FPParserParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(FPParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apndl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApndl(FPParserParser.ApndlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apndr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApndr(FPParserParser.ApndrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistl(FPParserParser.DistlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistr(FPParserParser.DistrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iota}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIota(FPParserParser.IotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(FPParserParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FPParserParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FPParserParser.ListContext ctx);
}