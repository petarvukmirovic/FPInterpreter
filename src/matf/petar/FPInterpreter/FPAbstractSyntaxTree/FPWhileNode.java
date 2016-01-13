package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPWhileNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPFunctionalFormNode predicate =
                (FPFunctionalFormNode) this.getChildren().get(0);
        FPFunctionalFormNode function =
                (FPFunctionalFormNode) this.getChildren().get(1);

        Atom predResAtom = predicate.applyFunctionalForm(arg, environment);

        if (predResAtom instanceof FPBoolAtomNode) {
            FPBoolAtomNode predicateResult = (FPBoolAtomNode) predResAtom;

            if (predicateResult.evaluate()) {
                Atom newArg = function.applyFunctionalForm(arg, environment);

                return this.applyFunctionalForm(newArg, environment);
            } else {
                return arg;
            }

        } else {
            throw new IllegalArgumentException("predicate result must be a bool atom");
        }
    }
}
