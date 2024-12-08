package Tema3.ClasesStringStringBuffer.AlgoritmosDeOrdenacion;

import java.util.Arrays;

public class Ejercicio3 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /*
     * Realiza un método que tome como parámetros de entrada dos arrays de enteros y
     * devuelva como
     * salida un único array con los dos elementos de los anteriores arrays
     * ordenados de forma ascendente.
     */

    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[5];

        int salida[] = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = numero_aleatorio(1, 10);
            salida[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = numero_aleatorio(1, 10);
            salida[array1.length + i] = array2[i];
        }

        Arrays.sort(salida);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Salida: " + Arrays.toString(salida));

    }
}
