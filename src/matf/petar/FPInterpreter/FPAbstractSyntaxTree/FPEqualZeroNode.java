package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPEqualZeroNode extends FPBuiltinFunctionNode {
    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedArg =
                HelperMethods.extractArgument(functionArgument);

        if (extractedArg != null &&
                extractedArg instanceof FPIntAtomNode) {
            FPIntAtomNode intAtom = (FPIntAtomNode) extractedArg;

            return new FPBoolAtomNode(intAtom.evaluate() == 0);
        } else {
            String msg = "eq0 arugment must be a singleton int list or " +
                    "int atom";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public String toString() {
        return "eq0";
    }
}
