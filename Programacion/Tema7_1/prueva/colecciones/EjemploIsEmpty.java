package Tema7_1.prueva.colecciones;

import java.util.ArrayList;
import java.util.Collection;

public class EjemploIsEmpty {
    public static void main(String[] args) {

        //Devuelve true si la colección no tiene elementos, es decir, si está vacía.

        Collection<Integer> numeros = new ArrayList<>();
        System.out.println(numeros.isEmpty());

        numeros.add(1);
        System.out.println(numeros.isEmpty());


    }
}
