package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPAppendRightNode extends FPBuiltinFunctionNode {
    private static String errorMsg =
            "apndr argument must be a list of the type <A, B> where A "
                    + " is a list and B is an atom.";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        FPListAtomNode listResult = new FPListAtomNode();

        if (functionArgument instanceof FPListAtomNode) {
            List<Atom> argumentsList = (List<Atom>) functionArgument.evaluate();

            Atom fstArg = argumentsList.get(0);
            Atom sndArg = argumentsList.get(1);

            if (fstArg instanceof FPListAtomNode) {
                FPListAtomNode fstArgList = (FPListAtomNode) fstArg;

                /* constructing new list by prepending first node to
                   second argument.
                 */
                listResult.addChild(fstArgList.getChildren()
                        .toArray(new FPTreeNode[0]));
                listResult.addChild((FPTreeNode) sndArg);
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
        return "apndr";
    }
}
