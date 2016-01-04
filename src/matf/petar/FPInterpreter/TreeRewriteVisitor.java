package matf.petar.FPInterpreter;

import matf.petar.FPInterpreter.FPAbstractSyntaxTree.*;
import matf.petar.FPInterpreter.gen.FPParserBaseVisitor;
import matf.petar.FPInterpreter.gen.FPParserParser;
import org.antlr.v4.runtime.tree.ParseTree;


public class TreeRewriteVisitor extends FPParserBaseVisitor<FPTreeNode> {

    @Override
    public FPTreeNode visitProgram(FPParserParser.ProgramContext ctx) {
        try {
            FPProgramNode program = new FPProgramNode();

            int childCount = ctx.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ParseTree programCtxChild = ctx.getChild(i);

                if (!",".equals(programCtxChild.getText())) {
                    FPTreeNode aProgramChild = visit(programCtxChild);
                    program.addChild(aProgramChild);
                }
            }
            return program;
        } catch (Exception e) {
            // if there is  error in the visiting
            // of children, then return null
            return null;
        }
    }

    @Override
    public FPTreeNode visitDefinition(FPParserParser.DefinitionContext ctx) {
        String functionName = ctx.FUN_ID().getText();

        FPFunctionDefinitionNode functionDefinition =
                new FPFunctionDefinitionNode(functionName);

        FPTreeNode definedFunction = visit(ctx.functional_form());
        functionDefinition.addChild(definedFunction);

        return functionDefinition;
    }

    @Override
    public FPTreeNode visitExpression(FPParserParser.ExpressionContext ctx) {
        int childCount = ctx.getChildCount();

        if (childCount == 1){
            /* if expression is only an atom */
            return visit(ctx.atom());
        }
        else {
            /* an expression if function application */
            FPFunctionApplicationNode functionApplication = new FPFunctionApplicationNode();

            FPTreeNode functionalForm = visit(ctx.functional_form());
            FPTreeNode expression = visit(ctx.expression());

            functionApplication.addChild(functionalForm, expression);

            return functionApplication;
        }
    }

    @Override
    public FPTreeNode visitConstructionLabel(FPParserParser.ConstructionLabelContext ctx) {
        return visit(ctx.construction());
    }

    @Override
    public FPTreeNode visitInsertLeft(FPParserParser.InsertLeftContext ctx) {
        FPInsertLeftNode iln = new FPInsertLeftNode();

        iln.addChild(visit(ctx.functional_form()));

        return iln;
    }

    @Override
    public FPTreeNode visitConstantLabel(FPParserParser.ConstantLabelContext ctx) {
        return visit(ctx.constant());
    }

    @Override
    public FPTreeNode visitComposition(FPParserParser.CompositionContext ctx) {
        FPCompositionNode composition = new FPCompositionNode();

        composition.addChild(visit(ctx.functional_form(0)),
                             visit(ctx.functional_form(1)));

        return composition;
    }

    @Override
    public FPTreeNode visitApplyAll(FPParserParser.ApplyAllContext ctx) {
        FPApplyAllNode applyAll = new FPApplyAllNode();

        applyAll.addChild(visit(ctx.functional_form()));

        return applyAll;
    }

    @Override
    public FPTreeNode visitConditionalLabel(FPParserParser.ConditionalLabelContext ctx) {
        return visit(ctx.conditional());
    }

    @Override
    public FPTreeNode visitElementary(FPParserParser.ElementaryContext ctx) {
        return visit(ctx.function());
    }

    @Override
    public FPTreeNode visitInsertRight(FPParserParser.InsertRightContext ctx) {
        FPInsertRightNode irn = new FPInsertRightNode();

        irn.addChild(visit(ctx.functional_form()));

        return irn;
    }

    @Override
    public FPTreeNode visitParenths(FPParserParser.ParenthsContext ctx) {
        return visit(ctx.functional_form());
    }

    @Override
    public FPTreeNode visitConstruction(FPParserParser.ConstructionContext ctx) {
        FPConstructionNode cons = new FPConstructionNode();

        for(FPParserParser.Functional_formContext consChild : ctx.functional_form()){
            cons.addChild(visit(consChild));
        }

        return cons;
    }

    @Override
    public FPTreeNode visitConditional(FPParserParser.ConditionalContext ctx) {
        FPConditionalNode conditional = new FPConditionalNode();

        for(FPParserParser.Functional_formContext condChild : ctx.functional_form()){
            conditional.addChild(visit(condChild));
        }

        return conditional;
    }

    @Override
    public FPTreeNode visitConstant(FPParserParser.ConstantContext ctx) {
        FPConstantNode constant = new FPConstantNode();

        FPIntAtomNode constantValue =
                new FPIntAtomNode(Integer.parseInt(ctx.NUM().getText()));

        constant.addChild(constantValue);

        return constant;
    }

    @Override
    public FPTreeNode visitFunction(FPParserParser.FunctionContext ctx) {
        if (ctx.FUN_ID() != null){
            /* the node is the name of function */
            return new FPFunctionNameNode(ctx.FUN_ID().getText());
        }
        else {
            /* the node is built-in function */
            return visit(ctx.built_in_function());
        }
    }

    @Override
    public FPTreeNode visitNum(FPParserParser.NumContext ctx) {
        int integerIndex = Integer.parseInt(ctx.NUM().getText());

        if (integerIndex < 0){
            throw new IllegalArgumentException("Selector index must be zero or positive integer.");
        }

        return new FPSelectorNode(Integer.parseInt(ctx.NUM().getText()));
    }

    @Override
    public FPTreeNode visitTail(FPParserParser.TailContext ctx) {
        return new FPTailNode();
    }

    @Override
    public FPTreeNode visitId(FPParserParser.IdContext ctx) {
        return new FPIdentityNode();
    }

    @Override
    public FPTreeNode visitEq(FPParserParser.EqContext ctx) {
        return new FPEqualNode();
    }

    @Override
    public FPTreeNode visitEq0(FPParserParser.Eq0Context ctx) {
        return new FPEqualZeroNode();
    }

    @Override
    public FPTreeNode visitGt(FPParserParser.GtContext ctx) {
        return new FPGreaterThanNode();
    }

    @Override
    public FPTreeNode visitGe(FPParserParser.GeContext ctx) {
        return new FPGreaterThanOrEqualNode();
    }

    @Override
    public FPTreeNode visitArithmetic(FPParserParser.ArithmeticContext ctx) {
        return new FPArithmeticNode(ctx.getText().charAt(0));
    }

    @Override
    public FPTreeNode visitA(FPParserParser.AContext ctx) {
        return new FPAddOneNode();
    }

    @Override
    public FPTreeNode visitS(FPParserParser.SContext ctx) {
        return new FPSubtractOneNode();
    }

    @Override
    public FPTreeNode visitApndl(FPParserParser.ApndlContext ctx) {
        return new FPAppendLeftNode();
    }

    @Override
    public FPTreeNode visitApndr(FPParserParser.ApndrContext ctx) {
        return new FPAppendRightNode();
    }

    @Override
    public FPTreeNode visitDistl(FPParserParser.DistlContext ctx) {
        return new FPDistributeLeftNode();
    }

    @Override
    public FPTreeNode visitDistr(FPParserParser.DistrContext ctx) {
        return new FPDistributeRightNode();
    }

    @Override
    public FPTreeNode visitIota(FPParserParser.IotaContext ctx) {
        return new FPIotaNode();
    }

    @Override
    public FPTreeNode visitAtom(FPParserParser.AtomContext ctx) {
        if (ctx.NUM() != null){
            /* atom is just an integer */
            int numValue = Integer.parseInt(ctx.NUM().getText());
            return new FPIntAtomNode(numValue);
        }
        else if (ctx.BOOL() != null) {
            /* atom is boolean value */
            boolean truthValue = Boolean.parseBoolean(ctx.BOOL().getText());
            return new FPBoolAtomNode(truthValue);
        }
        else {
            /* atom is list */
            return visit(ctx.list());
        }
    }

    @Override
    public FPTreeNode visitList(FPParserParser.ListContext ctx) {
        FPListAtomNode list = new FPListAtomNode();

        for(FPParserParser.AtomContext atom : ctx.atom()){
            list.addChild(visit(atom));
        }

        return list;
    }
}
