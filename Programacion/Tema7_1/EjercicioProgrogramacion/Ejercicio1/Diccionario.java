package Tema7_1.EjercicioProgrogramacion.Ejercicio1;

import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {

    /**
     * Atributos
     */
    TreeSet<Entrada> entrada;

    /**
     * Constructor
     */
    public Diccionario() {
        this.entrada = new TreeSet<>(Comparator.comparing(Entrada :: getPalabraEspanol));
    }

    /**
     * Getter Setter
     */
    public TreeSet<Entrada> getEntrada() {
        return entrada;
    }

    public void setEntrada(TreeSet<Entrada> entrada) {
        this.entrada = entrada;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diccionario{");
        sb.append("entrada=").append(entrada);
        sb.append('}');
        return sb.toString();
    }

    /**
     * addEntrada
     */

    public void addEntrada(Entrada entradas){
        if (!entrada.contains(entradas)){
            entrada.add(entradas);
        }else {
            System.out.println("Ya existe este entrada");
        }
    }

    /**
     * removeEntrada
     */
    public void removeEntrada(Entrada entradas){
        entrada.remove(entradas);
    }

    /**
     * listarPalabras
     */
    public void listarPalabras(){
        for (Entrada e : entrada){
            System.out.println(e);
        }
    }

    /**
     * buscarEntradas
     */

    public String buscarEntradas(String palabra){
        for (Entrada e : entrada){
            if (e.getPalabraEspanol().equals(palabra)){

                return e.getPalabraEngles();
            }

        }
        return "";
    }

}
