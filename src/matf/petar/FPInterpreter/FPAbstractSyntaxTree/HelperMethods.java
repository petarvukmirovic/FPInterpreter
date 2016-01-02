package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.util.List;

/**
 * Created by Petar Vukmirovic on 1/1/2016.
 */
public class HelperMethods {
    /**
     * Extracts an atom from singleton list atom argument,
     * or returns an atom if it is Int or BoolAtom
     *
     * @param a atom to be
     * @return extracted Atom argument from the list,
     * or the element itself if the argument
     * is Int or BoolAtom
     * null if Atom is neither list node
     * nor Int nor BoolAtom
     */
    public static Atom extractArgument(Atom a) {
        Atom ret = null;
        if (a instanceof FPListAtomNode) {
            FPListAtomNode listArg = (FPListAtomNode) a;

            List<Atom> list = listArg.evaluate();

            if (list.size() == 1) {
                ret = list.get(0);
            }
        } else {
            ret = a;
        }

        return ret;
    }
}
