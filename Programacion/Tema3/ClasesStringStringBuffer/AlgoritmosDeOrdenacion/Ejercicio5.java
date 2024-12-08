package Tema3.ClasesStringStringBuffer.AlgoritmosDeOrdenacion;

import java.util.Arrays;

public class Ejercicio5 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int mayor(int[] tabla) {
        int array = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > array) {
                array = tabla[i];
            }
        }
        return array;
    }

    /**
     * Realiza un programa que cree 100 números aleatorios
     * entre 1 y 1000 y que muestre los 10 mayores.
     */

    public static void main(String[] args) {

        int numero[] = new int[100];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1, 1000);
        }

        Arrays.sort(numero);
        System.out.println(Arrays.toString(numero) + " - ");
        System.out.println("\nEl 10 mayoris numeros es");

        for (int i = 90; i <= 100; i++) {
            System.out.print(numero[i] + " - ");
        }

    }
}
