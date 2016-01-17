package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by petar on 1.1.16..
 */
public class FPBoolAtomNode extends FPExpressionNode implements Atom {
    private boolean _value;

    public FPBoolAtomNode(boolean value){
        _value = value;
    }

    @Override
    public List<FPTreeNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public Boolean evaluate() {
        return _value;
    }

    @Override
    public String toString() {
        return _value ? "TRUE" : "FALSE";
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof FPBoolAtomNode)) {
            return false;
        }

        FPBoolAtomNode otherAtom = (FPBoolAtomNode) other;

        return this._value == otherAtom._value;
    }

    @Override
    public Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment) {
        return this;
    }

    @Override
    public void printStepByStep(Map<String, FPFunctionalFormNode> environment, OutputStreamWriter out, String resultSoFar) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);
        HelperMethods.appendIfFileOpen(out, resultSoFar + apply + this.toString());
    }
}
