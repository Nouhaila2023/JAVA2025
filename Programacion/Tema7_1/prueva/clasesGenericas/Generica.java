package Tema7_1.prueva.clasesGenericas;

import java.util.ArrayList;
import java.util.List;

public class Generica <T extends Robot> {

    private String nombre;
    private List<T> lista;

    /**
     * Constructor
     */
    public Generica(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    /**
     * Añadir
     */

    public void add(T t) {
        if (!lista.contains(t)) {
            lista.add(t);
        }else {
            System.out.println(t.nombre + " ya existe");
        }
    }

    /**
     * Borar
     */
    public void remove(T t) {
        if (lista.contains(t)) {
            lista.remove(t);
        }
    }

    /**
     * Mostrar los participantes
     */
    public void mostrar() {
        for (T t : lista) {
            System.out.println(t);
        }
    }

    /**
     * Getter Setter
     */
    public String getNombre() {
        return nombre;
    }

    public Generica<T> setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public List<T> getLista() {
        return lista;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Generica{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
