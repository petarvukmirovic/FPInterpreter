package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPFunctionNameNode extends FPFunctionNode {
    public FPFunctionNameNode(String functionName){
        _funName = functionName;
    }

    public String getFunctionName(){
        return _funName;
    }

    private String _funName;
}
