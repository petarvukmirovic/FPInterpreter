package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPInsertLeftNode extends FPFunctionalFormNode {

    private static final String errorMsg =
            "when applied to an expression INSERT-LEFT "
                    + "functional form expects a list atom";

    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode ffToApply =
                (FPFunctionalFormNode) this.getChildren().get(0);

        if (arg instanceof FPListAtomNode) {
            FPListAtomNode listArg = (FPListAtomNode) arg;

            /* If list length is 1,
               then only element in the list is the result.
             */
            if (listArg.evaluate().size() == 1) {
                return HelperMethods.extractArgument(listArg.evaluate().get(0));
            }

            FPTailNode tailFun = new FPTailNode();

            /* Else recursively apply INSERT-LEFT to the argument
               with its last element removed.
               That is if the list if <x1, x2, x3, ... , xN>
               apply INSERT-LEFT to <x1, x2, x3,..., xN-1>
            */
            FPListAtomNode newList = new FPListAtomNode();
            List<Atom> oldListContents = listArg.evaluate();

            for (int i = 0; i < oldListContents.size() - 1; i++) {
                newList.addChild((FPTreeNode) oldListContents.get(i));
            }

            Atom restResult = this.applyFunctionalForm(newList, environment);

            FPListAtomNode newArguments = new FPListAtomNode();
            newArguments.addChild((FPTreeNode) restResult);
            newArguments.addChild((FPTreeNode) oldListContents.get(oldListContents.size() - 1));

            /* And then apply functional form to the result of INSERT-LEFT
               applied to rest of the list (see explanation above),
               and the last element of the argument.
             */
            return ffToApply.applyFunctionalForm(newArguments, environment);

        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
