package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPIdentityNode extends FPBuiltinFunctionNode {
    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        return functionArgument;
    }

    @Override
    public String toString() {
        return "id";
    }
}
