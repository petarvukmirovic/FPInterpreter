package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class FPProgramNode extends FPTreeNode {
    private Map<String, FPFunctionalFormNode> _programEnvironment
            = new HashMap<>();

    public String run(OutputStreamWriter out) {
        StringBuilder builder = new StringBuilder();
        try {
            for (FPTreeNode command : this.getChildren()) {
                if (command instanceof FPFunctionDefinitionNode) {
                    _programEnvironment =
                            ((FPFunctionDefinitionNode) command)
                                    .registerFunction(_programEnvironment);
                    HelperMethods.appendIfFileOpen(out, command.toString());
                } else {
                    // command is expression evaluation
                    FPExpressionNode expression = (FPExpressionNode) command;
                    builder.append(expression.evaluateExpression(_programEnvironment)
                            + "\n");

                    expression.printStepByStep(getProgramEnvironment(), out, "");
                }
            }
        } catch (Exception e) {
            builder.append(e.getMessage() + "\n");
        } finally {
            return builder.toString();
        }
    }

    public String run() {
        return this.run(null);
    }

    public Map<String, FPFunctionalFormNode> getProgramEnvironment() {
        return new HashMap<>(_programEnvironment);
    }

    public void setProgramEnvironment(Map<String, FPFunctionalFormNode> value) {
        this._programEnvironment = new HashMap<>(value);
    }


}
