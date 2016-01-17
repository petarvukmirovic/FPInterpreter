package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPConstantNode extends FPFunctionalFormNode {

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        /* return num value, no matter what argument
           is passed.
         */
        return getIntConstant();
    }

    private FPIntAtomNode getIntConstant() {
        return (FPIntAtomNode) this.getChildren().get(0);
    }

    @Override
    public String toString() {
        return "~" + getIntConstant();
    }
}
