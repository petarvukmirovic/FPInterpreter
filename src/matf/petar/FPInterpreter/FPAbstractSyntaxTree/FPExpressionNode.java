package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public abstract class FPExpressionNode extends FPTreeNode {
    public abstract Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment);

    public abstract void printStepByStep(Map<String, FPFunctionalFormNode> environment,
                                         OutputStreamWriter out, String resultSoFar) throws IOException;
}
