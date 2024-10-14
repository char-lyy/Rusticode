import language.RusticodeBaseVisitor;
import language.RusticodeParser;

/**
 * Clase que extiende el visitante base generado por ANTLR para la gramática Rusticode.
 *
 * Esta clase proporciona implementaciones personalizadas para visitar los nodos del árbol
 * sintáctico generado por el parser de Rusticode. Se encarga de realizar el análisis
 * semántico del código fuente basándose en las reglas específicas del lenguaje Rusticode.
 *
 * Responsabilidades principales:
 * - Recorrer el árbol sintáctico generado por el parser de Rusticode.
 * - Realizar comprobaciones semánticas específicas del lenguaje Rusticode.
 * - Generar información semántica o código intermedio según sea necesario.
 *
 * Algunas comprobaciones semánticas que podría incluir (a confirmar según las especificaciones de Rusticode):
 * - Verificar la declaración y ámbito de variables.
 * - Comprobar la compatibilidad de tipos en expresiones y asignaciones.
 * - Validar el uso correcto de estructuras de control y funciones.
 *
 * Uso típico:
 * RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
 * visitor.visit(tree);
 *
 * @see org.antlr.v4.runtime.tree.AbstractParseTreeVisitor
 * @see language.RusticodeParser
 */
public class AnalizadorSemantico extends RusticodeBaseVisitor<Void> {
    private TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();

    @Override
    public Void visitDefinicion(RusticodeParser.DefinicionContext ctx) {
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
    public Void visitAsignacion(RusticodeParser.AsignacionContext ctx) {
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
    private String obtenerTipoLiteral(RusticodeParser.Literal_valueContext ctx) {
        if (ctx.NUM() != null) return "int";
        if (ctx.CHAR() != null) return "char";
        if (ctx.bool() != null) return "bool";
        return null;
    }

    // Método auxiliar para obtener el tipo de una expresión matemática
    private String obtenerTipoExpresion(RusticodeParser.Exp_matContext ctx) {
        return "int"; // Ejemplo básico
    }

    @Override
    public Void visitIf_sentence(RusticodeParser.If_sentenceContext ctx) {
        String conditionType = obtenerTipoExpresion(ctx.bool());
        if (!conditionType.equals("bool")) {
            throw new RuntimeException("Error: La condición en el if debe ser de tipo bool.");
        }
        return visitChildren(ctx);
    }
}