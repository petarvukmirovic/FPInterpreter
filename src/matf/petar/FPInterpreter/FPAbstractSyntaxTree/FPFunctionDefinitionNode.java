package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.HashMap;
import java.util.Map;

public class FPFunctionDefinitionNode extends FPTreeNode {
    private String _functionName;

    public FPFunctionDefinitionNode(String name) {
        _functionName = name;
    }

    public String getFunctionName(){
        return _functionName;
    }

    public Map<String, FPFunctionalFormNode>
    registerFunction(Map<String, FPFunctionalFormNode> environment) {
        if (!environment.containsKey(getFunctionName())) {
            Map<String, FPFunctionalFormNode> newEnvironment =
                    new HashMap<>(environment);

            newEnvironment.put(getFunctionName(),
                    (FPFunctionalFormNode) this.getChildren().get(0));

            return newEnvironment;
        } else {
            String errorMsg = "function " + _functionName + " already defined";
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
