package univr.it;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import univr.it.sigma.SigmaLexer;
import univr.it.sigma.SigmaParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        SigmaLexer lexer = new SigmaLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SigmaParser parser = new SigmaParser(tokenStream);

        ParseTree tree = parser.main();
        IntSigma interprete = new IntSigma(new Conf());
        interprete.visit(tree);
    }
}