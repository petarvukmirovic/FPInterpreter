package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;

/**
 * Created by petar on 1.1.16..
 */
public class FPArithmeticNode extends FPFunctionNode {

    private static String errorMsg =
            "arithmetic operation arguments must either be two "
                    + "int atom element list or two lists with int atom "
                    + "elements. ";
    private char _operation;

    public FPArithmeticNode(char operation) {
        this._operation = operation;
    }

    @Override
    public Object evaluate(Atom functionArgument) {
        if (functionArgument instanceof FPListAtomNode) {
            FPListAtomNode listArgument = (FPListAtomNode) functionArgument;

            List<Atom> atomList = listArgument.evaluate();
            if (atomList.size() == 2) {
                Atom rhs = atomList.get(0);
                Atom lhs = atomList.get(1);

                if (rhs instanceof FPIntAtomNode &&
                        lhs instanceof FPIntAtomNode) {
                    FPIntAtomNode rhsIntAtom = (FPIntAtomNode) rhs;
                    FPIntAtomNode lhsIntAtom = (FPIntAtomNode) lhs;

                    return rhsIntAtom.performArithmetic(lhsIntAtom, _operation);
                } else if (rhs instanceof FPListAtomNode &&
                        lhs instanceof FPListAtomNode) {
                    FPListAtomNode rhsListAtom = (FPListAtomNode) rhs;
                    FPListAtomNode lhsListAtom = (FPListAtomNode) lhs;

                    return rhsListAtom.performArithmetic(lhsListAtom, _operation);
                } else {
                    throw new IllegalArgumentException(errorMsg);
                }
            } else {
                throw new IllegalArgumentException(errorMsg);
            }
        } else {
            throw new IllegalArgumentException(errorMsg);
        }
    }
}
