import java.util.ArrayList;
import java.util.List;

public class NodoSemantico {
    private String tipo;
    private String nombre;
    private List<NodoSemantico> hijos;

    public NodoSemantico(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(NodoSemantico hijo) {
        hijos.add(hijo);
    }

    public List<NodoSemantico> getHijos() {
        return hijos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return nombre;
    }

    @Override
    public String toString() {
        return tipo + ": " + nombre;
    }
}