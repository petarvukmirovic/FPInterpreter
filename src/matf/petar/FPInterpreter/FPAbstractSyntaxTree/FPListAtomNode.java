package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FPListAtomNode extends FPExpressionNode implements Atom {
    private ArrayList<Atom> _list;

    public FPListAtomNode(){
        _list = new ArrayList<>();
    }

    @Override
    public List<Atom> evaluate() {
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

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof FPListAtomNode)){
            return false;
        }

        FPListAtomNode otherList = (FPListAtomNode)other;

        if (this._list.size() != otherList._list.size()){
            return false;
        }

        for(int i=0; i<this._list.size(); i++){
            if (!this._list.get(i).equals(otherList._list.get(i))){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("<");
        if (_list.size() != 0) {
            builder.append(_list.get(0).toString());

            for (Atom anElement : _list.subList(1, _list.size())) {
                builder.append(", ");
                builder.append(anElement);
            }
        }
        builder.append(">");

        return builder.toString();
    }

    FPListAtomNode performArithmetic(FPListAtomNode otherList, char operation){
        FPListAtomNode result = new FPListAtomNode();

        if (this._list.size() == otherList._list.size()){
            for(int i=0; i<this._list.size(); i++){
                Atom rhs = this._list.get(i);
                Atom lhs = otherList._list.get(i);

                if (rhs instanceof FPIntAtomNode &&
                        lhs instanceof FPIntAtomNode){
                    FPIntAtomNode rhsIntAtom = (FPIntAtomNode)rhs;
                    FPIntAtomNode lhsIntAtom = (FPIntAtomNode)lhs;
                    result.addChild(rhsIntAtom.performArithmetic(lhsIntAtom, operation));
                }
                else {
                    String msg = operation + " arguments must be int atoms";
                    throw new IllegalArgumentException(msg);
                }
            }
            return result;
        }
        else {
            String msg = operation + " arguments must be lists of the same size";
            throw new IllegalArgumentException(msg);
        }
    }

    @Override
    public void printStepByStep(Map<String, FPFunctionalFormNode> environment, OutputStreamWriter out, String resultSoFar) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);
        out.write(resultSoFar + apply + this.toString());
    }

    @Override
    public Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment) {
        return this;
    }
}
