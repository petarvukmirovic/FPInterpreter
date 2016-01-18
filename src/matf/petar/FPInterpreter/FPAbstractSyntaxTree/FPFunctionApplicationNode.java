package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPFunctionApplicationNode extends FPExpressionNode  {
    @Override
    public Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode ffToApply = getFFToApply();
        FPExpressionNode expressionArgument = getExpressionArgument();

        return ffToApply.applyFunctionalForm(
                expressionArgument.evaluateExpression(environment),
                environment);
    }

    @Override
    public void printStepByStep(Map<String, FPFunctionalFormNode> environment, OutputStreamWriter out,
                                String resultSoFar) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);
        FPExpressionNode expressionArgument = getExpressionArgument();
        FPFunctionalFormNode ffToApply = getFFToApply();

        expressionArgument.printStepByStep(environment, out,
                resultSoFar + apply + ffToApply.toString());

        Atom expressionResult = expressionArgument.evaluateExpression(environment);

        ffToApply.printStepByStep(expressionResult, environment, resultSoFar, out);
    }


    private FPExpressionNode getExpressionArgument() {
        return (FPExpressionNode) this.getChildren().get(1);
    }

    private FPFunctionalFormNode getFFToApply() {
        return (FPFunctionalFormNode) this.getChildren().get(0);
    }

    @Override
    public String toString() {
        return getFFToApply() + " : " + getExpressionArgument();
    }
}
