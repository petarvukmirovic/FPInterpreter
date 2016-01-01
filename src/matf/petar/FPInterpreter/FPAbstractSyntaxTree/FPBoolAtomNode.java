package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petar on 1.1.16..
 */
public class FPBoolAtomNode extends FPTreeNode implements Atom {
    public FPBoolAtomNode(boolean value){
        _value = value;
    }

    @Override
    public List<FPTreeNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public Object getValue() {
        return _value;
    }

    private boolean _value;

}
