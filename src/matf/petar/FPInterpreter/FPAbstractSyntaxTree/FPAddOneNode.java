package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPAddOneNode extends FPBuiltinFunctionNode {
    private static String errorMsg = "a argument must be a singleton "
            + "int list or int atom";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedArgument = HelperMethods.extractArgument(functionArgument);
        if (extractedArgument != null &&
                extractedArgument instanceof FPIntAtomNode) {
            FPIntAtomNode intAtom = (FPIntAtomNode) extractedArgument;

            if (functionArgument instanceof FPIntAtomNode) {
                return new FPIntAtomNode(intAtom.evaluate() + 1);
            } else {
                FPListAtomNode singletonList = new FPListAtomNode();
                singletonList.addChild(new FPIntAtomNode(intAtom.evaluate() + 1));

                return singletonList;
            }
        } else {

            throw new IllegalArgumentException(errorMsg);
        }
    }

    @Override
    public String toString() {
        return "a";
    }
}
