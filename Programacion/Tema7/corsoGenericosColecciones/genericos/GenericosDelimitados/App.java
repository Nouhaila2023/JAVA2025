package Tema7.corsoGenericosColecciones.genericos.GenericosDelimitados;

import java.util.List;

public class App {
    public static void main(String[] args) {

        MathListUtil<Integer> sumaListaInteger = new MathListUtil<>();
        List<Integer> numerosInteros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer resultaIn = (int) sumaListaInteger.suma(numerosInteros);
        System.out.println(resultaIn);


        MathListUtil<Double> sumaListaDouble = new MathListUtil<>();
        List<Double> numerosUtilis = List.of(1.0, 2.0, 3.0, 4.0, 5.3, 6.2, 7.1, 8.0);
        Double resultaInDouble = sumaListaDouble.suma(numerosUtilis);
        System.out.println(resultaInDouble);


        System.out.println(MultipleBound.max(1,2,3));


    }
}
