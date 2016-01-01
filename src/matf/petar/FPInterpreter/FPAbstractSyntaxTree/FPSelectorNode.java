package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPSelectorNode extends FPFunctionNode {
    public FPSelectorNode(int index){
        _index = index;
    }

    public int getIndex(){
        return _index;
    }

    private int _index;

}
