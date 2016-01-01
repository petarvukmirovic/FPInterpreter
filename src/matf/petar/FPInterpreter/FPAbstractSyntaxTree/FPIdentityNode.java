package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPIdentityNode extends FPFunctionNode {
    @Override
    public Object evaluate(Atom functionArgument) {
        return functionArgument;
    }
}
