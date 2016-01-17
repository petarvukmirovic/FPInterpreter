package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPSubtractOneNode extends FPBuiltinFunctionNode {

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedArgument = HelperMethods.extractArgument(functionArgument);
        if (extractedArgument != null &&
                extractedArgument instanceof FPIntAtomNode) {
            FPIntAtomNode intAtom = (FPIntAtomNode) extractedArgument;

            if (functionArgument instanceof FPIntAtomNode) {
                return new FPIntAtomNode(intAtom.evaluate() - 1);
            } else {
                FPListAtomNode singletonList = new FPListAtomNode();
                singletonList.addChild(new FPIntAtomNode(intAtom.evaluate() - 1));

                return singletonList;
            }
        } else {
            String msg = "s argument must be a singleton int list or int atom";
            throw new IllegalArgumentException(msg);
        }

    }

    @Override
    public String toString() {
        return "s";
    }
}
