package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.HashMap;
import java.util.Map;

public class FPProgramNode extends FPTreeNode {
    private Map<String, FPFunctionalFormNode> _programEnvironment
            = new HashMap<>();

    public void run() {
        try {
            for (FPTreeNode command : this.getChildren()) {
                if (command instanceof FPFunctionDefinitionNode) {
                    _programEnvironment =
                            ((FPFunctionDefinitionNode) command)
                                    .registerFunction(_programEnvironment);
                } else {
                    // command is expression evaluation
                    FPExpressionNode expression = (FPExpressionNode) command;
                    System.out.println(expression.evaluateExpression(_programEnvironment));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
