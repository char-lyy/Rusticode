import java.util.HashMap;
import java.util.Map;

/*
* En esta clase, se almacenarán las declaraciones de variables y sus tipos.
* Usa HashMap para almacenar el nombre de las variables como llaves y sus tipos como valores.
*
*/
public class TablaDeSimbolos {
    private Map<String, String> tabla;

    public TablaDeSimbolos() {
        tabla = new HashMap<>();
    }

    public void declarar(String nombre, String tipo) {
        if (tabla.containsKey(nombre)) {
            throw new RuntimeException("Error: Variable '" + nombre + "' ya está declarada.");
        }
        tabla.put(nombre, tipo);
    }

    public String obtenerTipo(String nombre) {
        if (!tabla.containsKey(nombre)) {
            throw new RuntimeException("Error: Variable '" + nombre + "' no está declarada.");
        }
        return tabla.get(nombre);
    }

    public boolean existe(String nombre) {
        return tabla.containsKey(nombre);
    }
}
