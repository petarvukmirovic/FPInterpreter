package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.ArrayList;
import java.util.List;

public abstract class FPTreeNode {
    public FPTreeNode(){
        _children = new ArrayList<>();
    }

    public List<FPTreeNode> getChildren(){
        return _children;
    }

    public void addChild(FPTreeNode... children){
        for(FPTreeNode child : children){
            _children.add(child);
        }
    }

    public String toString(){
        String theRestOfTheTree =
                _children.stream()
                .map((node) -> node.toString())
                .reduce("", (acc, nodeString) -> acc + " " + nodeString);

        return "(" + this.getClass().getSimpleName() +  " " + theRestOfTheTree + ")";
    }

    protected ArrayList<FPTreeNode> _children;
}
