package tema7_2.stremas;

import java.util.ArrayList;
import java.util.List;

public class EjemploBusqueda {
    public static void main(String[] args) {

        ArrayList<String> paises = new ArrayList<>(
                List.of("España","Francia","EEUU","Mexico","Vietnam","India","China")
        );

        //Uno que conteng la letra a

        String paisesConA = paises.stream()
                .filter(p -> p.contains("a"))
                //te da el premero lo que ha encontrado
                .findAny()
                .orElse("No encontrado");

        System.out.println(paisesConA);

        //Hay algon paises con V

        boolean paisesConV = paises.stream()
                .anyMatch(pa -> pa.contains("V"));

        System.out.println(paisesConV);
//DeferenciaEntreFindAny_findFirst
        boolean mayor5 = paises.stream()
                .allMatch( p -> p.length() >= 4);
        System.out.println("Mayor que 5 " + mayor5);

        String conO = paises.stream()
                .filter(p -> p.contains("o"))
                .findFirst()
                .orElse("No encontrado");
        System.out.println("País con o: " + conO);

    }
}
