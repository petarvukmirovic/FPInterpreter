package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.Map;

public class FPConstructionNode extends FPFunctionalFormNode {
    @Override
    public Atom applyFunctionalForm(Atom arg, Map<String, FPFunctionalFormNode> environment) {
        FPListAtomNode resultList = new FPListAtomNode();

        for (FPTreeNode ff : this.getChildren()) {
            FPFunctionalFormNode ffToApply = (FPFunctionalFormNode) ff;

            resultList.addChild(
                    (FPTreeNode) ffToApply.applyFunctionalForm(arg, environment));
        }

        return resultList;
    }

    @Override
    public String toString() {
        /* Children list is not being changed,
           so we can safely run parallelStream.

           (I have never tried it, this is my
            shot :)
         */
        String commaSeparatedFF =
                this.getChildren().parallelStream()
                        .limit(this.getChildren().size() - 1)
                        .map(ff -> ff.toString() + ", ")
                        .reduce("", (a, b) -> a + b);

        String last = this.getChildren()
                .get(this.getChildren().size() - 1)
                .toString();

        return "[" + commaSeparatedFF + last + "]";
    }
}
