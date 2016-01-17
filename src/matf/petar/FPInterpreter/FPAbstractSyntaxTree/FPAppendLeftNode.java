package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPAppendLeftNode extends FPBuiltinFunctionNode {

    private static String errorMsg =
            "apndl argument must be a list of the type <A, B> where A "
                    + " is an atom an B is a list";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        FPListAtomNode listResult = new FPListAtomNode();

        if (functionArgument instanceof FPListAtomNode) {
            List<Atom> argumentsList = (List<Atom>) functionArgument.evaluate();

            if (argumentsList.size() == 2) {
                Atom fstArg = argumentsList.get(0);
                Atom sndArg = argumentsList.get(1);

                if (sndArg instanceof FPListAtomNode) {
                    FPListAtomNode sndArgList = (FPListAtomNode) sndArg;

                /* constructing new list by prepending first node to
                   second argument.
                 */
                    listResult.addChild((FPTreeNode) fstArg);
                    listResult.addChild(sndArgList.getChildren()
                            .toArray(new FPTreeNode[0]));
                } else {
                    throw new IllegalArgumentException(errorMsg);
                }
            } else {
                throw new IllegalArgumentException(errorMsg);
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }

        return listResult;
    }

    @Override
    public String toString() {
        return "apndl";
    }
}
