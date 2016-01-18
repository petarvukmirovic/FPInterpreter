// Generated from C:/Users/Petar Vukmirovic/IdeaProjects/FPInterpreter/src/grammar\FPParser.g4 by ANTLR 4.5.1
package matf.petar.FPInterpreter.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FPParserParser}.
 */
public interface FPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FPParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FPParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FPParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(FPParserParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(FPParserParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FPParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FPParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructionLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterConstructionLabel(FPParserParser.ConstructionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructionLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitConstructionLabel(FPParserParser.ConstructionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertLeft}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterInsertLeft(FPParserParser.InsertLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertLeft}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitInsertLeft(FPParserParser.InsertLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterConstantLabel(FPParserParser.ConstantLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitConstantLabel(FPParserParser.ConstantLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code composition}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterComposition(FPParserParser.CompositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code composition}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitComposition(FPParserParser.CompositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyAll}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterApplyAll(FPParserParser.ApplyAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyAll}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitApplyAll(FPParserParser.ApplyAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterConditionalLabel(FPParserParser.ConditionalLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalLabel}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitConditionalLabel(FPParserParser.ConditionalLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementary}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterElementary(FPParserParser.ElementaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementary}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitElementary(FPParserParser.ElementaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FPParserParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FPParserParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertRight}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterInsertRight(FPParserParser.InsertRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertRight}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitInsertRight(FPParserParser.InsertRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenths}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterParenths(FPParserParser.ParenthsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenths}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitParenths(FPParserParser.ParenthsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryToUnary}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void enterBinaryToUnary(FPParserParser.BinaryToUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryToUnary}
	 * labeled alternative in {@link FPParserParser#functional_form}.
	 * @param ctx the parse tree
	 */
	void exitBinaryToUnary(FPParserParser.BinaryToUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#construction}.
	 * @param ctx the parse tree
	 */
	void enterConstruction(FPParserParser.ConstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#construction}.
	 * @param ctx the parse tree
	 */
	void exitConstruction(FPParserParser.ConstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(FPParserParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(FPParserParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FPParserParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FPParserParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FPParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FPParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterNum(FPParserParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitNum(FPParserParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tail}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterTail(FPParserParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tail}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitTail(FPParserParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterId(FPParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitId(FPParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterEq(FPParserParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitEq(FPParserParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq0}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterEq0(FPParserParser.Eq0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eq0}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitEq0(FPParserParser.Eq0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterGt(FPParserParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitGt(FPParserParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ge}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterGe(FPParserParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitGe(FPParserParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(FPParserParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(FPParserParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code a}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterA(FPParserParser.AContext ctx);
	/**
	 * Exit a parse tree produced by the {@code a}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitA(FPParserParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code s}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterS(FPParserParser.SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code s}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitS(FPParserParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apndl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterApndl(FPParserParser.ApndlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apndl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitApndl(FPParserParser.ApndlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apndr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterApndr(FPParserParser.ApndrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apndr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitApndr(FPParserParser.ApndrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDistl(FPParserParser.DistlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distl}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDistl(FPParserParser.DistlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDistr(FPParserParser.DistrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distr}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDistr(FPParserParser.DistrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iota}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterIota(FPParserParser.IotaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iota}
	 * labeled alternative in {@link FPParserParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitIota(FPParserParser.IotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FPParserParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FPParserParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FPParserParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FPParserParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FPParserParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FPParserParser.ListContext ctx);
}