package Tema7_1.prueva.genericoConTipoComodin;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("La suma de la lista entera es: "+ sumOfList(lista));

        List<Float> lista2 = Arrays.asList(1f, 2f, 3f, 4f, 5f);
        System.out.println("La suma de la lista es: "+ sumOfList(lista2));

    }

    public static double sumOfList(List<? extends Number> list){
        double sum = 0.0;
        for(Number n : list){
            sum += n.doubleValue();

        }
        return sum;
    }

}

