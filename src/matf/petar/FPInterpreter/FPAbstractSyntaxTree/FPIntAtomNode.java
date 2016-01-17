package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class FPIntAtomNode extends FPExpressionNode implements Atom {

    private int _value;

    public FPIntAtomNode(int value){
        _value = value;
    }

    @Override
    public Integer evaluate() {
        return _value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof FPIntAtomNode)) {
            return false;
        }

        FPIntAtomNode otherAtom = (FPIntAtomNode) other;

        return this._value == otherAtom._value;
    }

    @Override
    public String toString() {
        return "" + _value;
    }

    FPIntAtomNode performArithmetic(FPIntAtomNode other, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = this._value + other._value;
                break;
            case '-':
                result = this._value - other._value;
                break;
            case '*':
                result = this._value * other._value;
                break;
            case '/':
                if (other._value == 0) {
                    throw new IllegalArgumentException("division by zero attempted");
                }
                result = this._value / other._value;
                break;
            default:
                // should not happen, since parser will check for operation
                throw new IllegalArgumentException("unknown operation");
        }

        return new FPIntAtomNode(result);
    }

    @Override
    public Atom evaluateExpression(Map<String, FPFunctionalFormNode> environment) {
        return this;
    }

    @Override
    public void printStepByStep(Map<String, FPFunctionalFormNode> environment, OutputStreamWriter out, String resultSoFar) throws IOException {
        String apply = HelperMethods.getApplyForState(resultSoFar);
        out.write(resultSoFar + apply + this.toString());
    }
}
