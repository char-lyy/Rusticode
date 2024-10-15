import language.RusticodeLexer;
import language.RusticodeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    private static final String FILE_NAME = "test.smp";
    private static final String FOLDER_NAME = "./src/test";

    public static void main(String[] args) throws IOException { // Agrega throws IOException
        String projectRoot = System.getProperty("user.dir");
        String filePath = Paths.get(projectRoot, FOLDER_NAME, FILE_NAME).toString();

        //System.out.println("Intentando interpretar archivo: " + filePath);

        // Verificar si el archivo existe
        if (!Files.exists(Paths.get(filePath))) {
            throw new IOException("El archivo no existe: " + filePath);
        }

        // Leer el contenido del archivo
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        CharStream input = CharStreams.fromString(content);

        // Crear el lexer
        RusticodeLexer lexer = new RusticodeLexer(input);

        // Crear un stream de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser
        RusticodeParser parser = new RusticodeParser(tokens);

        // Obtener el árbol de análisis
        ParseTree tree = parser.programa();

        // Imprimir el árbol
        System.out.println("Árbol de análisis:");
        System.out.println(tree.toStringTree(parser));

        // Ejecutar el analizador semántico
        AnalizadorSemantico analizador = new AnalizadorSemantico();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(analizador, tree);

        // Imprimir errores semánticos
        List<String> errores = analizador.getErrores();
        if (errores.isEmpty()) {
            System.out.println("Análisis semántico completado sin errores.");
        } else {
            System.out.println("Errores encontrados:");
            for (String error : errores) {
                System.out.println(error);
            }
        }
    }


}