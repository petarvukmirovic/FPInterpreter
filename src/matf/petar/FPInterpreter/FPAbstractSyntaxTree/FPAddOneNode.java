package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

public class FPAddOneNode extends FPFunctionNode {
    private static String errorMsg = "a argument must be a singleton "
            + "int list or int atom";

    @Override
    public Object evaluate(Atom functionArgument) {
        Atom extractedAtom = HelperMethods.extractArgument(functionArgument);

        if (extractedAtom != null &&
                extractedAtom instanceof FPIntAtomNode) {
            return new FPIntAtomNode((int) extractedAtom.evaluate() + 1);
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
