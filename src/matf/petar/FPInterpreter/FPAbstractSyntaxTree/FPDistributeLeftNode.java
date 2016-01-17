package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPDistributeLeftNode extends FPBuiltinFunctionNode {

    private static final String errorMsg =
            "distl arugment must be a two element list of the form "
                    + "<A,B> where A is an atom and B is a list";

    @Override
    public String toString() {
        return "distl";
    }

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listArg = (FPListAtomNode) functionArgument;

            List<Atom> argContents = listArg.evaluate();

            Atom elementToInsert = argContents.get(0);
            Atom aList = argContents.get(1);

            if (aList instanceof FPListAtomNode) {
                FPListAtomNode listToInsertTo = (FPListAtomNode) aList;

                FPListAtomNode result = new FPListAtomNode();

                for (Atom existingElement : listToInsertTo.evaluate()) {
                    FPListAtomNode anElement = new FPListAtomNode();

                    anElement.addChild((FPTreeNode) elementToInsert);
                    anElement.addChild((FPTreeNode) existingElement);

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
