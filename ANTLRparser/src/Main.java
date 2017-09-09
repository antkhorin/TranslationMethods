import gen.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("Input.java"));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        parser.start();
    }
}