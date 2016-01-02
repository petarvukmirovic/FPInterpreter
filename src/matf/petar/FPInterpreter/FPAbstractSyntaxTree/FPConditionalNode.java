package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPConditionalNode extends FPFunctionalFormNode {

    private static final String errorMsg =
            "predicate result must be a BOOL atom";

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode predicate =
                (FPFunctionalFormNode) this.getChildren().get(0);
        FPFunctionalFormNode ifTrueFF =
                (FPFunctionalFormNode) this.getChildren().get(1);
        FPFunctionalFormNode ifFalseFF =
                (FPFunctionalFormNode) this.getChildren().get(2);

        Atom predicateResult = predicate.applyFunctionalForm(arg, environment);

        if (predicateResult instanceof FPBoolAtomNode) {
            if ((boolean) predicateResult.evaluate()) {
                return ifTrueFF.applyFunctionalForm(arg, environment);
            } else {
                return ifFalseFF.applyFunctionalForm(arg, environment);
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
