package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPInsertRightNode extends FPFunctionalFormNode {
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

            /* Else recursively apply INSERT-RIGHT to the tail */
            Atom tailResult = this.applyFunctionalForm(
                    tailFun.evaluate(listArg, environment),
                    environment);

            FPListAtomNode newArguments = new FPListAtomNode();
            newArguments.addChild((FPTreeNode) listArg.evaluate().get(0));
            newArguments.addChild((FPTreeNode) tailResult);

            /* And then apply functional for the result first element of
               the list and result of the application of INSERT-RIGHT
               to the list tail.
             */
            return ffToApply.applyFunctionalForm(newArguments, environment);

        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
