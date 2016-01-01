package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FPFunctionNameNode extends FPFunctionNode {
    private String _funName;

    public FPFunctionNameNode(String functionName){
        _funName = functionName;
    }

    public String getFunctionName(){
        return _funName;
    }

    @Override
    public Object evaluate(Atom functionArgument) {
        // TODO Implement.
        throw new NotImplementedException();
    }
}
