package matf.petar.FPInterpreter;

import matf.petar.FPInterpreter.cmd.REPLInterpreter;
import matf.petar.FPInterpreter.gui.FPInterpreterGUI;

/* DEF fact = (eq0 -> ~1; * . [id, fact . s])
   factorial definition

   DEF length = INSERT-RIGHT + . APPLY-ALL ~1
   length definition
 */

public class Launcher {
    public static void main(String[] args) {
        if (args.length == 0 ||
                "gui".equals(args[0].trim().toLowerCase())) {
            try {
                new FPInterpreterGUI().main(null);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else if ("cmd".equals(args[0].trim().toLowerCase())) {
            new REPLInterpreter().startREPL();
        }
    }
}
