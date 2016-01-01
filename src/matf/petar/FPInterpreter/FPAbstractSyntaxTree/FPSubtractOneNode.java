package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPSubtractOneNode extends FPFunctionNode {

    @Override
    public Object evaluate(Atom functionArgument) {
        Atom extractedArgument = HelperMethods.extractArgument(functionArgument);
        if (extractedArgument != null &&
                extractedArgument instanceof FPIntAtomNode) {
            FPIntAtomNode intAtom = (FPIntAtomNode) extractedArgument;

            return new FPIntAtomNode((int) intAtom.evaluate() - 1);
        } else {
            String msg = "s argument must be a singleton int list or int atom";
            throw new IllegalArgumentException(msg);
        }

    }
}
