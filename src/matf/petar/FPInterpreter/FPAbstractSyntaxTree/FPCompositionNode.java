package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class FPCompositionNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode leftFF = getLeftFF();
        FPFunctionalFormNode rightFF = getRightFF();

        return leftFF.applyFunctionalForm(
                rightFF.applyFunctionalForm(arg, environment),
                environment);
    }

    private FPFunctionalFormNode getRightFF() {
        return (FPFunctionalFormNode) this.getChildren().get(1);
    }

    private FPFunctionalFormNode getLeftFF() {
        return (FPFunctionalFormNode) this.getChildren().get(0);
    }

    @Override
    public void printStepByStep(Atom arg, Map<String, FPFunctionalFormNode> environment,
                                String resultSoFar, OutputStreamWriter out) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);
        HelperMethods.appendIfFileOpen(out, resultSoFar + this.toString() + ":" + arg + "\n");

        Atom rightResult = this.getRightFF().applyFunctionalForm(arg, environment);
        HelperMethods.appendIfFileOpen(out, resultSoFar + this.getLeftFF() + ":" + rightResult + "\n");

        Atom compositionResult = this.getLeftFF().applyFunctionalForm(rightResult, environment);
        HelperMethods.appendIfFileOpen(out, resultSoFar + apply + compositionResult + "\n");
    }

    @Override
    public String toString() {
        return this.getLeftFF() + " . " + this.getRightFF();
    }
}
