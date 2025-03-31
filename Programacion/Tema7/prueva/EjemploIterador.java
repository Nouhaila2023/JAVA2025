package Tema7.prueva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploIterador {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(List.of(1,2,3,4,5,6));


        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(lista);
    }

    /**
     * Explicación:
     *
     * iterator() obtiene un iterador para la lista.
     *
     * hasNext() verifica si hay más elementos en la lista.
     *
     * next() obtiene el siguiente número.
     *
     * remove() elimina los números impares.
     */

}
