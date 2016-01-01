package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

/**
 * Created by petar on 1.1.16..
 */
public class FPArithmeticNode extends FPFunctionNode {

    public FPArithmeticNode(char operation) {
        this._operation = operation;
    }

    private char _operation;
}
