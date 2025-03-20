package Tema7.prueva.colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana");

        // يسمح بالتكرار
        System.out.println("Contenido de la lista: " + frutas);

        System.out.println("Primer fruto: " + frutas.get(0));

        for (String fruta : frutas) {
            System.out.println("Fruta: "+  fruta);
        }

    }

}
