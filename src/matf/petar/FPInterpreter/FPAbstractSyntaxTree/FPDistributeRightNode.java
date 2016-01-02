package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPDistributeRightNode extends FPBuiltinFunctionNode {
    private static final String errorMsg =
            "distr argument must be a two element list of the form "
                    + "<A,B> where A is a list and B is an atom";

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listArg = (FPListAtomNode) functionArgument;

            List<Atom> argContents = listArg.evaluate();

            Atom aList = argContents.get(0);
            Atom elementToInsert = argContents.get(1);

            if (aList instanceof FPListAtomNode) {
                FPListAtomNode listToInsertTo = (FPListAtomNode) aList;

                FPListAtomNode result = new FPListAtomNode();

                for (Atom existingElement : listToInsertTo.evaluate()) {
                    FPListAtomNode anElement = new FPListAtomNode();

                    anElement.addChild((FPTreeNode) existingElement);
                    anElement.addChild((FPTreeNode) elementToInsert);

                    result.addChild(anElement);
                }

                return result;
            } else {
                throw new IllegalArgumentException(errorMsg);
            }

        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
