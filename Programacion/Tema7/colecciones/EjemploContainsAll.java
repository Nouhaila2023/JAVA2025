package Tema7.colecciones;

import java.util.ArrayList;
import java.util.Collection;

public class EjemploContainsAll {

    /**
     * Explicación:
     * Recibe una colección c como parámetro.
     * Devuelve true si todos los elementos de c están en la colección actual.
     * El <?> significa que acepta colecciones de cualquier tipo.
     * @param c
     * @return
     */

    public static boolean containsAll(Collection<?> c) {
        // tu lógica personalizada aquí
        return c.containsAll(c);
    }

    public static void main(String[] args) {

        Collection<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");

        Collection<String> lista2 = new ArrayList<>();
        lista2.add("A");
        lista2.add("B");

        boolean resultado = lista1.containsAll(lista2);
        System.out.println(resultado); // true, porque "A" y "B" están en lista1


    }




}
