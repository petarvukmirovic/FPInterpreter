package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPGreaterThanOrEqualNode extends FPBuiltinFunctionNode {
    private static String errorMsg =
            "ge argument must be  a two integer list.";

    @Override
    public String toString() {
        return "ge";
    }

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listAtom = (FPListAtomNode) functionArgument;

            List<Atom> atomList = listAtom.evaluate();

            if (atomList.size() == 2) {
                Atom fstArg = atomList.get(0);
                Atom sndArg = atomList.get(1);

                if (fstArg instanceof FPIntAtomNode
                        && sndArg instanceof FPIntAtomNode) {
                    boolean isGreaterOrEqual =
                            ((FPIntAtomNode) fstArg).evaluate() >=
                                    ((FPIntAtomNode) sndArg).evaluate();

                    return new FPBoolAtomNode(isGreaterOrEqual);
                } else {
                    throw new IllegalArgumentException(errorMsg);
                }
            } else {
                throw new IllegalArgumentException(errorMsg);
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
