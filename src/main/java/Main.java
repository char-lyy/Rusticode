import language.RusticodeLexer;
import language.RusticodeParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;


public class Main {

    private static final String EXTENSION = "rstcd";

    public static void main(String[] args) throws IOException {
        String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

        System.out.println("Interpreting file " + program);

        RusticodeLexer lexer = new RusticodeLexer(CharStreams.fromFileName(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RusticodeParser parser = new RusticodeParser(tokens);

        RusticodeParser.StartContext tree = parser.start();

        AnalizadorSemantico visitor = new AnalizadorSemantico();
        visitor.visit(tree);

        // Ejecutar el análisis semántico
        AnalizadorSemantico analizador = new AnalizadorSemantico();
        analizador.visit(tree);

        System.out.println("Interpretation finished");

    }

}