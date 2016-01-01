package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

public class FPListAtomNode extends FPTreeNode implements Atom {
    public FPListAtomNode(){
        _list = new ArrayList<Atom>();
    }

    @Override
    public List<Atom> getValue() {
        return _list;
    }

    @Override
    public void addChild(FPTreeNode... children) {
        super.addChild(children);

        for(FPTreeNode child : children){
            Atom atomNode = (Atom)child;
            _list.add(atomNode);
        }
    }


    ArrayList<Atom> _list;
}
