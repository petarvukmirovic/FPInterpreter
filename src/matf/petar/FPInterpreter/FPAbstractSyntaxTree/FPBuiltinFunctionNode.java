package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public abstract class FPBuiltinFunctionNode extends FPFunctionNode {
    @Override
    public void printStepByStep(Atom arg, Map<String, FPFunctionalFormNode> environment,
                                String resultSoFar, OutputStreamWriter out) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);

        HelperMethods.appendIfFileOpen(out, resultSoFar + " " + this.toString()
                + apply + arg + "\n");

        Atom result = this.evaluate(arg, environment);

        HelperMethods.appendIfFileOpen(out, resultSoFar + apply + result);
    }
}
