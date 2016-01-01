package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;

/**
 * Created by petar on 1.1.16..
 */
public class FPTailNode extends FPFunctionNode {
    @Override
    public Object evaluate(Atom functionArgument) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode arg = (FPListAtomNode) functionArgument;
            List<Atom> atomList = arg.evaluate();

            return atomList.subList(1, atomList.size());
        } else {
            throw new IllegalArgumentException("tail arugment must be a list.");
        }
    }
}
