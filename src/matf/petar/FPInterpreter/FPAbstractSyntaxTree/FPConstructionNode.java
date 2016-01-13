package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPConstructionNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPListAtomNode resultList = new FPListAtomNode();

        for (FPTreeNode ff : this.getChildren()) {
            FPFunctionalFormNode ffToApply = (FPFunctionalFormNode) ff;

            resultList.addChild(
                    (FPTreeNode) ffToApply.applyFunctionalForm(arg, environment));
        }

        return resultList;
    }
}
