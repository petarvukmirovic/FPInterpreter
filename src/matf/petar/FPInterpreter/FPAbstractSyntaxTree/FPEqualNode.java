package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPEqualNode extends FPBuiltinFunctionNode {
    private static String errorMsg = "eq argument must be two element list.";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listAtom = (FPListAtomNode) functionArgument;

            List<Atom> atomList = listAtom.evaluate();

            if (atomList.size() == 2) {
                return new FPBoolAtomNode(atomList.get(0).equals(atomList.get(1)));
            } else {
                throw new IllegalArgumentException(errorMsg);
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
