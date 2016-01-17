package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPApplyAllNode extends FPFunctionalFormNode {
    private final static String errorMsg =
            "when applied to an expression APPLY-ALL expects "
                    + " list input";

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        /* get functional form to apply */
        FPFunctionalFormNode ffToApply =
                (FPFunctionalFormNode) this.getChildren().get(0);

        FPListAtomNode result = new FPListAtomNode();

        if (arg instanceof FPListAtomNode) {
            for (Atom a : ((FPListAtomNode) arg).evaluate()) {
                result.addChild((FPTreeNode) ffToApply.applyFunctionalForm(a, environment));
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }

        return result;
    }

    @Override
    public String toString() {
        return "APPLY-ALL " + this.getChildren().get(0).toString();
    }
}
