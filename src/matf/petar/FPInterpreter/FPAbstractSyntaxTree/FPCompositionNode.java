package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPCompositionNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode leftFF =
                (FPFunctionalFormNode) this.getChildren().get(0);
        FPFunctionalFormNode rightFF =
                (FPFunctionalFormNode) this.getChildren().get(1);

        return leftFF.applyFunctionalForm(
                rightFF.applyFunctionalForm(arg, environment),
                environment);
    }
}
