package tema7_2.interfacesFuncionales;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {


        List<String> palabrea = new ArrayList<>(List.of("casa", "papel", "fruta", "empleado", "fatima"));

        //Ordenar de Z -> a
        System.out.println("Oredenad de Z --> A");
        palabrea.sort((e1,e2) -> e2.compareTo(e1));
        //Ordenar de A -> Z
        System.out.println("Ordenar de A --> Z");
        palabrea.sort(Comparator.naturalOrder());


        palabrea.forEach(System.out::println);

        //burar las palabras que empiezan con f
        System.out.println("Borrar Las palabras que empiezan con {f}");
        palabrea.removeIf(p -> p.startsWith("f"));
        palabrea.forEach(System.out::println);
        //Añadir
        System.out.println("Añadir una palabra a la lisat");
        palabrea.add("pepe");
        palabrea.forEach(System.out::println);

        System.out.println("---------------------------");
        //Los stremas no modifica la coleccion (palabras)
        palabrea.stream()
                .filter((pa) ->
                        {
                            System.out.println("-");
                            return pa.length() > 5;
                        })
                .filter(p -> p.startsWith("e"))//dejar solo las palabras que empiezan con e
                .map(p -> p.length())
                .forEach(System.out::println);

    }

    public boolean condicion(String p){
        return (p.length() > 5);
    }
}
