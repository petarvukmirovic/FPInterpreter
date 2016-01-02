package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPFunctionNameNode extends FPFunctionNode {
    private String _funName;

    public FPFunctionNameNode(String functionName){
        _funName = functionName;
    }

    public String getFunctionName(){
        return _funName;
    }

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode thisFunction = environment.get(getFunctionName());

        if (thisFunction != null) {
            return thisFunction.applyFunctionalForm(functionArgument, environment);
        } else {
            String errorMsg = getFunctionName() + " is undefined";
            throw new IllegalArgumentException(errorMsg);
        }
    }

}
