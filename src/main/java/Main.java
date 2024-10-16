import language.RusticodeLexer;
import language.RusticodeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


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

        // Obtener el árbol de análisis sintactico
        ParseTree tree = parser.programa();
        System.out.println("Árbol de análisis sintactico:");
        System.out.println(tree.toStringTree(parser));

        // Ejecutar el analizador semántico
        SemanticoVisitor analizador = new SemanticoVisitor();
        analizador.visit(tree);



        System.out.println("Arbol semantico");
        analizador.imprimirArbol();
    }

}