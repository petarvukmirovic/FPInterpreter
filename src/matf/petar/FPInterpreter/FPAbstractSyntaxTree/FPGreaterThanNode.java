package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPGreaterThanNode extends FPBuiltinFunctionNode {
    private static String errorMsg =
            "eq argument must be  a two integer list.";

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
                    boolean isGreater =
                            ((FPIntAtomNode) fstArg).evaluate() >
                                    ((FPIntAtomNode) sndArg).evaluate();

                    return new FPBoolAtomNode(isGreater);
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
