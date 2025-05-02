package Tema7_1.prueva.colecciones;

import java.util.ArrayList;
import java.util.Collection;

public class EjemploSize {

    public static void main(String[] args) {

        //Devuelve la cantidad de elementos que hay actualmente en la coleccio

        Collection<String> nombre = new ArrayList<>();
        nombre.add("Alex");
        nombre.add("Nouhaila");
        System.out.println("El sizaes: " + nombre.size());//Resultado: 2


    }

}
