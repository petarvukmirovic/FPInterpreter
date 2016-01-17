package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class FPConditionalNode extends FPFunctionalFormNode {

    private static final String errorMsg =
            "predicate result must be a BOOL atom";

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode predicate = getPredicate();
        FPFunctionalFormNode ifTrueFF = getIfTrueFF();
        FPFunctionalFormNode ifFalseFF = getIfFalseFF();

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

    @Override
    public void printStepByStep(Atom arg, Map<String, FPFunctionalFormNode> environment,
                                String resultSoFar, OutputStreamWriter out) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);

        HelperMethods.appendIfFileOpen(out, resultSoFar + this.toString() + apply + arg);

        Atom predicateResult = getPredicate().applyFunctionalForm(arg, environment);

        HelperMethods.appendIfFileOpen(out, resultSoFar + "(" + predicateResult + " -> "
                + getIfFalseFF() + ";" + getIfFalseFF() + ")"
                + apply + arg);

        Atom conditionalResult = this.applyFunctionalForm(arg, environment);

        HelperMethods.appendIfFileOpen(out, resultSoFar + apply + arg);
    }

    private FPFunctionalFormNode getIfFalseFF() {
        return (FPFunctionalFormNode) this.getChildren().get(2);
    }

    private FPFunctionalFormNode getIfTrueFF() {
        return (FPFunctionalFormNode) this.getChildren().get(1);
    }

    private FPFunctionalFormNode getPredicate() {
        return (FPFunctionalFormNode) this.getChildren().get(0);
    }

    @Override
    public String toString() {
        return "(" + getPredicate() + " -> "
                + getIfTrueFF() + "; " + getIfFalseFF() + ")";
    }
}
