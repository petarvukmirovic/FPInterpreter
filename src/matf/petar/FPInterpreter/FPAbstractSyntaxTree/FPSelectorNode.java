package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;
import java.util.Map;

public class FPSelectorNode extends FPBuiltinFunctionNode {
    private int _index;

    public FPSelectorNode(int index){
        _index = index;
    }

    public int getIndex(){
        return _index;
    }

    @Override
    public Atom evaluate(Atom functionArgument, Map<String, FPFunctionalFormNode> environment) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listArgument = (FPListAtomNode) functionArgument;

            List<Atom> list = listArgument.evaluate();
            try {
                // Indices start from 1
                return list.get(getIndex() - 1);
            } catch (IndexOutOfBoundsException ioobe) {
                String msg = "selector index not in list bounds.";
                throw new IllegalArgumentException(msg);
            }
        } else {
            String msg = "selector argument must be a list";
            throw new IllegalArgumentException(msg);
        }
    }

}
