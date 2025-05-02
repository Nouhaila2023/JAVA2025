package Tema7_1.prueva.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemplosSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("A");

        // لا يسمح بالتكرا

        System.out.println("Conteniso de Set: " + set);

        for (String s : set) {
            System.out.println(s);
        }


    }
}
