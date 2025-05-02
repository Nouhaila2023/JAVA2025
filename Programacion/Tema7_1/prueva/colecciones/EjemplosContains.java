package Tema7_1.prueva.colecciones;

import java.util.ArrayList;
import java.util.Collection;

public class EjemplosContains {
    public static void main(String[] args) {

        //Verifica si un elemento específico está dentro de la colección.
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        System.out.println(frutas.contains("Banana"));
        System.out.println(frutas.contains("Pera"));

    }
}
