package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;

/**
 * Created by petar on 1.1.16..
 */
public class FPEqualNode extends FPFunctionNode {
    private static String errorMsg = "eq argument must be two element list.";

    @Override
    public Object evaluate(Atom functionArgument) {
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
