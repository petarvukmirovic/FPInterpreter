package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPFunctionDefinitionNode extends FPTreeNode {
    public FPFunctionDefinitionNode(String name) {
        _functionName = name;
    }

    public String getFunctionName(){
        return _functionName;
    }


    private String _functionName;
}
