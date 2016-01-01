package matf.petar.FPInterpreter;

import matf.petar.FPInterpreter.FPAbstractSyntaxTree.FPProgramNode;
import matf.petar.FPInterpreter.gen.FPParserLexer;
import matf.petar.FPInterpreter.gen.FPParserParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class GrammarTest {
    public static void main(String[] args) {
        try {
            ANTLRInputStream ais = new ANTLRInputStream(System.in);
            FPParserLexer fppl = new FPParserLexer(ais);
            CommonTokenStream cts = new CommonTokenStream(fppl);
            FPParserParser fpp = new FPParserParser(cts);

            TreeRewriteVisitor treeRewrite = new TreeRewriteVisitor();
            FPProgramNode program = (FPProgramNode)treeRewrite.visitProgram(fpp.program());

            System.out.println(program);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
