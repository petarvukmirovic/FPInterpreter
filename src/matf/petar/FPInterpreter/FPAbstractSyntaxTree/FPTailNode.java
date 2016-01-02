package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPTailNode extends FPBuiltinFunctionNode {
    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode arg = (FPListAtomNode) functionArgument;
            List<Atom> atomList = arg.evaluate();

            FPListAtomNode listTail = new FPListAtomNode();

            for (Atom a : atomList.subList(1, atomList.size())) {
                listTail.addChild((FPTreeNode) a);
            }

            return listTail;
        } else {
            throw new IllegalArgumentException("tail arugment must be a list.");
        }
    }
}
