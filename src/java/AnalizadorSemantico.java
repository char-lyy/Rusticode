import java.util.HashMap;
import java.util.Map;

/*
Extiende una clase generada por ANTLR.
La cual permite visitar los nodos del arbol sintactico.
A su vez, valida la semantica del codigo fuente basado en las reglas del lenguaje.
Esto incluye:
    -Asegurarse que las variables esten declaradas antes de ser usadas.
    -Verificar los tipos de datos en las operaciones de asignacion y comparación.
    -Controlar que las expresiones booleanas sean validas dentro de las sentencias como if o while.


* */
public class AnalizadorSemantico extends SimpleBaseVisitor{
    private TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();

    @Override
    public Void visitDefinicion(SimpleParser.DefinicionContext ctx) {
        String varName = ctx.VAR().getText();
        String varType = ctx.type().getText();

        // Declarar la variable en la tabla de símbolos
        tablaDeSimbolos.declarar(varName, varType);

        // Si hay asignación de valor, validar tipo
        if (ctx.literal_value() != null) {
            String assignedType = obtenerTipoLiteral(ctx.literal_value());
            if (!varType.equals(assignedType)) {
                throw new RuntimeException("Error: No se puede asignar " + assignedType + " a " + varType);
            }
        }
        return null;
    }

    @Override
    public Void visitAsignacion(SimpleParser.AsignacionContext ctx) {
        String varName = ctx.VAR().getText();

        // Verificar que la variable esté declarada
        if (!tablaDeSimbolos.existe(varName)) {
            throw new RuntimeException("Error: Variable '" + varName + "' no está declarada.");
        }

        // Verificar el tipo de la asignación
        String varType = tablaDeSimbolos.obtenerTipo(varName);
        String assignedType = obtenerTipoExpresion(ctx.exp_mat());

        if (!varType.equals(assignedType)) {
            throw new RuntimeException("Error: Tipo incompatible. No se puede asignar " + assignedType + " a " + varType);
        }

        return null;
    }

    // Método auxiliar para obtener el tipo de un valor literal
    private String obtenerTipoLiteral(SimpleParser.Literal_valueContext ctx) {
        if (ctx.NUM() != null) return "int";
        if (ctx.CHAR() != null) return "char";
        if (ctx.bool() != null) return "bool";
        return null;
    }

    // Método auxiliar para obtener el tipo de una expresión matemática
    private String obtenerTipoExpresion(SimpleParser.Exp_matContext ctx) {
        return "int"; // Ejemplo básico
    }

    @Override
    public Void visitIf_sentence(SimpleParser.If_sentenceContext ctx) {
        String conditionType = obtenerTipoExpresion(ctx.bool());
        if (!conditionType.equals("bool")) {
            throw new RuntimeException("Error: La condición en el if debe ser de tipo bool.");
        }
        return visitChildren(ctx);
    }

}