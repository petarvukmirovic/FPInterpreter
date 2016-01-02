package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public abstract class FPFunctionNode extends FPFunctionalFormNode {
    public abstract Atom evaluate(Atom functionArgument,
                                  Map<String, FPFunctionalFormNode> environment);

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        return this.evaluate(arg, environment);
    }
}
