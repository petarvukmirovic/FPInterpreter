package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
public abstract class FPFunctionalFormNode extends FPTreeNode {
    public abstract Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment);

    public void printStepByStep(Atom arg, Map<String, FPFunctionalFormNode> environment,
                                String resultSoFar, OutputStreamWriter out) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);

        HelperMethods.appendIfFileOpen(out, resultSoFar + this.toString() + apply + arg);

        Atom result = this.applyFunctionalForm(arg, environment);

        HelperMethods.appendIfFileOpen(out, resultSoFar + apply + arg);
    }
}
