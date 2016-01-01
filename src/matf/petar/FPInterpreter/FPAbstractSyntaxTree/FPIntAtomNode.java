package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

public class FPIntAtomNode extends FPTreeNode implements Atom {

    public FPIntAtomNode(int value){
        _value = value;
    }

    @Override
    public Object getValue() {
        return _value;
    }

    private int _value;
}
