package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public abstract class FPFunctionalFormNode extends FPTreeNode {
    public abstract Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment);
}
