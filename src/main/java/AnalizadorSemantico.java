
import language.RusticodeBaseListener;
import language.RusticodeParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class AnalizadorSemantico extends RusticodeBaseListener {
    private TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();
    private List<String> errores = new ArrayList<>();


    /**
     * Se utiliza este metodo cuando se encuentra una definicion de variable.
     * Verifica si la variable ya está definida, sino, la agrega a la tabla de simbolos.
     */
    @Override
    public void enterDefinicion(RusticodeParser.DefinicionContext ctx) {
        String tipo = ctx.type() != null ? ctx.type().getText() : ctx.getChild(0).getText();
        String nombre = ctx.VAR().getText();

        if (tablaSimbolos.existeSimbolo(nombre)) {
            errores.add("Error: Variable '" + nombre + "' ya definida.");
        } else {
            tablaSimbolos.agregarSimbolo(nombre, tipo);
        }
    }



    /**
     * Verifica que una variable esté definida antes de una asignacion y
     * que el tipo de valor asignado sea compatible.
     *
     */
    @Override
    public void enterAsignacion(RusticodeParser.AsignacionContext ctx) {
        String nombre = ctx.VAR().getText();

        if (!tablaSimbolos.existeSimbolo(nombre)) {
            errores.add("Error: Variable '" + nombre + "' no definida.");
        } else {
            String tipoVariable = tablaSimbolos.getTipo(nombre);
            String tipoValor = inferirTipo(ctx);

            if (!tipoVariable.equals(tipoValor) && !tipoValor.equals("desconocido")) {
                errores.add("Error: Tipo incompatible en asignación a '" + nombre + "'.");
            }
        }
    }



    private String inferirTipo(RusticodeParser.AsignacionContext ctx) {
        if (ctx.literal_value() != null) {
            return inferirTipoLiteral(ctx.literal_value());
        } else if (ctx.exp_mat() != null) {
            return "int"; // Asumimos que las expresiones matemáticas resultan en int o real
        }
        return "desconocido";
    }

    private String inferirTipoLiteral(RusticodeParser.Literal_valueContext ctx) {
        if (ctx.NUM() != null) {
            return ctx.NUM().getText().contains(".") ? "real" : "int";
        } else if (ctx.CHAR() != null) {
            return "char";
        } else if (ctx.bool() != null) {
            return "bool";
        }
        return "desconocido";
    }



    /**
     * Verifica que todas las variables usadas en expresiones matematicas sean de tipo numerico.
     */
    @Override
    public void enterExp_mat(RusticodeParser.Exp_matContext ctx) {
        // Verificar tipos en expresiones matemáticas
        for (RusticodeParser.TerminoContext termino : ctx.termino()) {
            for (RusticodeParser.FactorContext factor : termino.factor()) {
                verificarTipoNumerico(factor);
            }
        }
    }

    private void verificarTipoNumerico(RusticodeParser.FactorContext ctx) {
        if (ctx.VAR() != null) {
            String nombre = ctx.VAR().getText();
            if (!tablaSimbolos.existeSimbolo(nombre)) {
                errores.add("Error: Variable '" + nombre + "' no definida en expresión matemática.");
            } else {
                String tipo = tablaSimbolos.getTipo(nombre);
                if (!tipo.equals("int") && !tipo.equals("real")) {
                    errores.add("Error: Variable '" + nombre + "' no es de tipo numérico.");
                }
            }
        }
    }



    /**
     * Verifica que todas las variables usadas en expresiones logicas sean de tipo booleano.
     */

    @Override
    public void enterExp_log(RusticodeParser.Exp_logContext ctx) {
        // Verificar tipos en expresiones lógicas
        if (ctx.VAR() != null && !ctx.VAR().isEmpty()) {
            verificarTipoLogico(ctx.VAR(0).getText());
        }
        for (RusticodeParser.Exp_logContext subExpr : ctx.exp_log()) {
            if (subExpr.VAR() != null && !subExpr.VAR().isEmpty()) {
                verificarTipoLogico(subExpr.VAR(0).getText());
            }
        }
    }

    private void verificarTipoLogico(String nombre) {
        if (!tablaSimbolos.existeSimbolo(nombre)) {
            errores.add("Error: Variable '" + nombre + "' no definida en expresión lógica.");
        } else {
            String tipo = tablaSimbolos.getTipo(nombre);
            if (!tipo.equals("bool")) {
                errores.add("Error: Variable '" + nombre + "' no es de tipo booleano.");
            }
        }
    }



    @Override
    public void enterIf_sentence(RusticodeParser.If_sentenceContext ctx) {
        verificarCondicion(ctx.exp_log());
    }

    @Override
    public void enterWhile_sentence(RusticodeParser.While_sentenceContext ctx) {
        verificarCondicion(ctx.bool());
    }

    private void verificarCondicion(ParserRuleContext ctx) {
        // Verificar que la condición sea booleana
        if (ctx instanceof RusticodeParser.Exp_logContext) {
            // Lógica para expresiones lógicas
            verificarExpresionLogica((RusticodeParser.Exp_logContext) ctx);
        } else if (ctx instanceof RusticodeParser.BoolContext) {
            // Lógica para booleanos literales
            // No necesita verificación adicional ya que es un booleano literal
        } else {
            errores.add("Error: La condición debe ser una expresión booleana.");
        }
    }

    private void verificarExpresionLogica(RusticodeParser.Exp_logContext ctx) {
        // Verificar cada parte de la expresión lógica
        for (RusticodeParser.Exp_logContext subExpr : ctx.exp_log()) {
            verificarExpresionLogica(subExpr);
        }
        if (ctx.VAR() != null && !ctx.VAR().isEmpty()) {
            verificarTipoLogico(ctx.VAR(0).getText());
        }
    }



    public List<String> getErrores() {
        return errores;
    }


}