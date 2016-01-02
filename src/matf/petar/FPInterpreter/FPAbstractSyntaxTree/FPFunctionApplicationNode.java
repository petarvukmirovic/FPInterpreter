package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPFunctionApplicationNode extends FPExpressionNode  {
    @Override
    public Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode ffToApply =
                (FPFunctionalFormNode) this.getChildren().get(0);
        FPExpressionNode expressionArgument =
                (FPExpressionNode) this.getChildren().get(1);

        return ffToApply.applyFunctionalForm(
                expressionArgument.evaluateExpression(environment),
                environment);
    }
}
