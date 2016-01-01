package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPEqualZeroNode extends FPFunctionNode {
    @Override
    public Object evaluate(Atom functionArgument) {
        Atom extractedArg =
                HelperMethods.extractArgument(functionArgument);

        if (extractedArg != null &&
                extractedArg instanceof FPIntAtomNode) {
            FPIntAtomNode intAtom = (FPIntAtomNode) extractedArg;

            return new FPBoolAtomNode((int) intAtom.evaluate() == 0);
        } else {
            String msg = "eq0 arugment must be a singleton int list or " +
                    "int atom";
            throw new IllegalArgumentException(msg);
        }
    }
}
