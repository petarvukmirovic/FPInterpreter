package matf.petar.FPInterpreter.FPAbstractSyntaxTree;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
public class HelperMethods {
    /**
     * Extracts an atom from singleton list atom argument,
     * or returns an atom if it is Int or BoolAtom
     *
     * @param a atom to be extracted
     * @return Atom argument from the list,
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

    /**
     * Appends string to OutputStreamWriter iff out is not null
     *
     * @param out  out file to write to
     * @param line line to write
     */
    public static void appendIfFileOpen(OutputStreamWriter out, String line)
            throws IOException {
        if (out != null) {
            out.write(line + "\n");
        }
    }

    /**
     * @param resultSoFar
     * @return ":" if we are not at the start of the call chain,
     * if we are at the start of the call chain, no ":"
     * is needed
     */
    public static String getApplyForState(String resultSoFar) {
        return "".equals(resultSoFar) ? "" : " : ";
    }
}
