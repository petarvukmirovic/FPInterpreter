package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPIotaNode extends FPFunctionNode {
    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        Atom extractedArgument =
                HelperMethods.extractArgument(functionArgument);
        if (extractedArgument != null
                && extractedArgument instanceof FPIntAtomNode) {
            int intArg = (int) extractedArgument.evaluate();

            FPListAtomNode newList = new FPListAtomNode();

            for (int i = 1; i <= intArg; i++)
                newList.addChild(new FPIntAtomNode(i));

            return newList;
        } else {
            String msg = "iota argument must be singleton int list" +
                    "or an int atom";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public String toString() {
        return "iota";
    }
}
