package tema7_2.interfacesFuncionales.predicate;


import tema7_2.interfacesFuncionales.Persona;

import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        List<Persona> personas = List.of(new Persona("Javi", "javi@gmail.com"),
                                        new Persona("Andrea", "and@gmail.com"),
                                        new Persona("Jose", "jose@gmail.com"));

        Predicate<Persona> p1 = p -> p.getNombre().equals("Andrea");
        Predicate<Persona> p2 = p -> p.getNombre().contains("e");
        Predicate<Persona> p3 = p -> p.getEmail().contains("@");

        personas.stream()
                .filter(p1.or(p2.or(p3)))
                .forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++");

        personas.stream()
                .filter(p1.or(p2))
                .forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++");


        personas.stream()
                .filter(p -> p.getNombre().contains("e") || p.getEmail().contains("gmail"))
                .forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++");

        //Devuelve todas las personas cuyo nombre tenga mas de 4 caracteres
        personas.stream()
                .filter( p -> p.getNombre().length() > 4)
                .forEach(System.out::println);






    }
}
