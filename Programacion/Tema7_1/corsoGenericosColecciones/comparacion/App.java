package Tema7_1.corsoGenericosColecciones.comparacion;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Alumno a1 = new Alumno(1, "Nouhaila", "AL haloui", 22);
        Alumno a3 = new Alumno(3, "juana", "juanita", 23);
        Alumno a2 = new Alumno(2, "jose", "Gallardos", 21);


        if (a1.compareTo(a2) > 0){
            System.out.println("EL alumno %s debe ir antes en la lista".formatted(a2));
        }else {
            System.out.println("El alumno %s debe ir an la lista".formatted(a1));
        }

        System.out.println("*****************************************************");


        List<Alumno> list = new ArrayList<>(List.of(a1,a2,a3));
        System.out.println("Lista en orden de insercion");
        System.out.println(list);
        System.out.println("*****************************************************");


        TreeSet<Alumno> treeSet = new TreeSet<>(list);
        System.out.println("Lista ordenado por apellido");
        System.out.println(treeSet);

        System.out.println("*****************************************************");

        TreeSet<Alumno> treeSet1 = new TreeSet<>(new ComparatorPorNotaDescendente());
        treeSet1.addAll(list);
        System.out.println("Lista ordenadda por edad");
        System.out.println(treeSet1);


    }
}
