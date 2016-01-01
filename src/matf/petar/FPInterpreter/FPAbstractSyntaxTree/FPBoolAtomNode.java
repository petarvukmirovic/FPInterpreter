package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petar on 1.1.16..
 */
public class FPBoolAtomNode extends FPTreeNode implements Atom {
    private boolean _value;

    public FPBoolAtomNode(boolean value){
        _value = value;
    }

    @Override
    public List<FPTreeNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public Object evaluate() {
        return _value;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof FPBoolAtomNode)) {
            return false;
        }

        FPBoolAtomNode otherAtom = (FPBoolAtomNode) other;

        return this._value == otherAtom._value;
    }

}
