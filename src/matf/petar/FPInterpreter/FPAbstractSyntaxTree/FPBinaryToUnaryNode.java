package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPBinaryToUnaryNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg,
                                    Map<String, FPFunctionalFormNode> environment) {
        FPListAtomNode twoArgList = new FPListAtomNode();
        twoArgList.addChild(this.getChildren().get(1));
        twoArgList.addChild((FPTreeNode) arg);

        return ((FPFunctionNode) this.getChildren().get(0))
                .evaluate(twoArgList, environment);

    }

}
