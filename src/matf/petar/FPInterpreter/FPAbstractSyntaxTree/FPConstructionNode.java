package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPConstructionNode extends FPFunctionalFormNode {
    private static final String errorMsg =
            "construction arguments must be a singleton list "
                    + "or an atom";

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedArg = HelperMethods.extractArgument(arg);

        if (extractedArg != null) {
            FPListAtomNode resultList = new FPListAtomNode();

            for (FPTreeNode ff : this.getChildren()) {
                FPFunctionalFormNode ffToApply = (FPFunctionalFormNode) ff;

                resultList.addChild(
                        (FPTreeNode) ffToApply.applyFunctionalForm(extractedArg, environment));
            }

            return resultList;
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
