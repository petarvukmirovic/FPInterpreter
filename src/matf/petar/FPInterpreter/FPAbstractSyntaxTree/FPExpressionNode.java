package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public abstract class FPExpressionNode extends FPTreeNode {
    public abstract Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment);
}
