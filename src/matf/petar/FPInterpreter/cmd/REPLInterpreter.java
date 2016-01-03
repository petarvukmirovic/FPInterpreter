package matf.petar.FPInterpreter.cmd;


import matf.petar.FPInterpreter.FPAbstractSyntaxTree.FPFunctionalFormNode;
import matf.petar.FPInterpreter.FPAbstractSyntaxTree.FPProgramNode;
import matf.petar.FPInterpreter.TreeRewriteVisitor;
import matf.petar.FPInterpreter.gen.FPParserLexer;
import matf.petar.FPInterpreter.gen.FPParserParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class REPLInterpreter {

    // Test
    public static void main(String[] args) {
        new REPLInterpreter().startREPL();
    }

    public void startREPL() {
        try (Scanner scanner = new Scanner(System.in)) {

            Map<String, FPFunctionalFormNode> environment =
                    new HashMap<>();
            System.out.print("> ");
            System.out.flush();
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                ANTLRInputStream ais = new ANTLRInputStream(line);
                FPParserLexer fppl = new FPParserLexer(ais);
                CommonTokenStream cts = new CommonTokenStream(fppl);
                FPParserParser fpp = new FPParserParser(cts);

                TreeRewriteVisitor treeRewrite = new TreeRewriteVisitor();
                FPProgramNode program = (FPProgramNode) treeRewrite.visitProgram(fpp.program());
                program.setProgramEnvironment(environment);

                String result = program.run();

                if (!"".equals(result.trim())) {
                    System.out.print(result);
                } else if (fpp.getNumberOfSyntaxErrors() == 0) {
                    System.out.println("OK");
                }

                System.out.print("> ");
                System.out.flush();

                environment = program.getProgramEnvironment();
            }
        }
    }
}
