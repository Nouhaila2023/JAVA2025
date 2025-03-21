package Tema7.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EjercicioToArray {
    public static void main(String[] args) {

        //Convierte la colección en un arreglo (array) de tipo Object[]

        Collection<String> paises = new ArrayList<>();
        paises.add("España");
        paises.add("Italia");

        Object[] arrayPaises = paises.toArray();
        System.out.println(Arrays.toString(arrayPaises)); // Resultado: [España, Italia]


    }
}
