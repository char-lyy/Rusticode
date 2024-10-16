import language.RusticodeBaseVisitor;
import language.RusticodeParser;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;


public class SemanticoVisitor extends RusticodeBaseVisitor<NodoSemantico> {
    private Map<String, String> variables;
    private Map<String, NodoSemantico> modulos;
    private NodoSemantico raiz;

    public SemanticoVisitor() {
        this.variables = new HashMap<>();
        this.modulos = new HashMap<>();
        this.raiz = new NodoSemantico("Programa", "Raíz");
    }

//    @Override
//    public NodoSemantico visitPrograma(RusticodeParser.ProgramaContext ctx) {
//        for (RusticodeParser.SentenciaContext sentencia : ctx.sentencia()) {
//            visit(sentencia);  // Visita cada sentencia individualmente
//        }
//        return raiz;
//    }

    @Override
    public NodoSemantico visitPrograma(RusticodeParser.ProgramaContext ctx) {
        // Recorre todas las sentencias en el programa
        for (RusticodeParser.SentenciaContext sentenciaCtx : ctx.sentencia()) {
            NodoSemantico nodoSentencia = visit(sentenciaCtx);  // Visita cada sentencia
            if (nodoSentencia != null) {
                raiz.agregarHijo(nodoSentencia);  // Agrega el resultado de la visita a los hijos de la raíz
            }
        }
        return raiz;  // Devuelve la raíz con todos sus hijos
    }



    @Override
    public NodoSemantico visitDefinicion(RusticodeParser.DefinicionContext ctx) {
        String tipo = ctx.type() != null ? ctx.type().getText() : ctx.getText().split(" ")[0];
        String id = ctx.VAR().getText();
        visitarVariable(tipo, id);
        return null;
    }

    @Override
    public NodoSemantico visitAsignacion(RusticodeParser.AsignacionContext ctx) {
        String id = ctx.VAR().getText();
        if (!variables.containsKey(id)) {
            System.err.println("Error: La variable " + id + " no ha sido declarada.");
        }
        return null;
    }

    @Override
    public NodoSemantico visitIf_sentence(RusticodeParser.If_sentenceContext ctx) {
        visitarEstructuraControl("If", ctx.exp_log().getText());
        visitChildren(ctx);
        return null;
    }

    @Override
    public NodoSemantico visitWhile_sentence(RusticodeParser.While_sentenceContext ctx) {
        visitarEstructuraControl("While", ctx.exp_log().getText());
        visitChildren(ctx);
        return null;
    }

    private void visitarVariable(String tipo, String id) {
        if (variables.containsKey(id)) {
            System.err.println("Error: La variable " + id + " ya está declarada.");
        } else {
            variables.put(id, tipo);
            NodoSemantico nodoVar = new NodoSemantico(tipo, id);
            raiz.agregarHijo(nodoVar);
        }
    }

    private void visitarEstructuraControl(String tipo, String condicion) {
        NodoSemantico nodoControl = new NodoSemantico(tipo, condicion);
        raiz.agregarHijo(nodoControl);
    }

    public NodoSemantico getRaiz() {
        return raiz;
    }

    public void imprimirArbol() {
        imprimirNodo(raiz, 0);
    }

    private void imprimirNodo(NodoSemantico nodo, int nivel) {
        System.out.println("  ".repeat(nivel) + nodo);
        for (NodoSemantico hijo : nodo.getHijos()) {
            imprimirNodo(hijo, nivel + 1);
        }
    }
}
