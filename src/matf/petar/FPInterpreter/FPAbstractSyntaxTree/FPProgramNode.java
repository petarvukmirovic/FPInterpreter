package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.HashMap;
import java.util.Map;

public class FPProgramNode extends FPTreeNode {
    private Map<String, FPFunctionalFormNode> _programEnvironment
            = new HashMap<>();

    public String run() {
        StringBuilder builder = new StringBuilder();
        try {
            for (FPTreeNode command : this.getChildren()) {
                if (command instanceof FPFunctionDefinitionNode) {
                    _programEnvironment =
                            ((FPFunctionDefinitionNode) command)
                                    .registerFunction(_programEnvironment);
                } else {
                    // command is expression evaluation
                    FPExpressionNode expression = (FPExpressionNode) command;
                    builder.append(expression.evaluateExpression(_programEnvironment)
                            + "\n");
                }
            }
        } catch (Exception e) {
            builder.append(e.getMessage() + "\n");
        } finally {
            return builder.toString();
        }
    }
}
