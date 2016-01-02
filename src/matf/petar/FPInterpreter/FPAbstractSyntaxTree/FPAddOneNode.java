package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPAddOneNode extends FPBuiltinFunctionNode {
    private static String errorMsg = "a argument must be a singleton "
            + "int list or int atom";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedAtom = HelperMethods.extractArgument(functionArgument);

        if (extractedAtom != null &&
                extractedAtom instanceof FPIntAtomNode) {
            return new FPIntAtomNode((int) extractedAtom.evaluate() + 1);
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
