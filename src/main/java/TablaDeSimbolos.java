import java.util.HashMap;
import java.util.Map;

/*
* En esta clase, se almacenarán las declaraciones de variables y sus tipos.
* Usa HashMap para almacenar el nombre de las variables como llaves y sus tipos como valores.
*
*/
public class TablaDeSimbolos {
    private Map<String, String> simbolos = new HashMap<>();

    //Añade una nueva variable a la tabla
    public void agregarSimbolo(String nombre, String tipo) {
        simbolos.put(nombre, tipo);
    }

    //Verifica si una variable ya ha sido declarada
    public boolean existeSimbolo(String nombre) {
        return simbolos.containsKey(nombre);
    }

    //Obtiene el tipo de una variable declarada
    public String getTipo(String nombre) {
        return simbolos.get(nombre);
    }
}
