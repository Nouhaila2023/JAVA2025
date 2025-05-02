package Tema7_1.prueva.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {

        //Devuelve un iterador que te permite recorrer la colección uno por uno.

        Collection<String> colores = new ArrayList<>();
        colores.add("Red");
        colores.add("Blue");

        Iterator<String> iterator = colores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
