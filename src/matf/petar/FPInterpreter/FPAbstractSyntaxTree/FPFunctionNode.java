package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public abstract class FPFunctionNode extends FPTreeNode {
    public abstract Object evaluate(Atom functionArgument);
}
