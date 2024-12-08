package Tema3.ClasesStringStringBuffer.AlgoritmosDeOrdenacion;

import java.util.Arrays;

public class Ejercicio1 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void pintar(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero_aleatorio(1, 100);

            System.out.println(array[i]);
        }
    }

    /**
     * Realiza un programa que cree un array de 50 posiciones cargado con valores
     * aleatorios. Los valores
     * aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector,
     * deberá ordenarlo mediante el
     * método de la burbuja y mostrarlo ordenado por pantalla. Para el método de la
     * burbuja deberás crear
     * una función que reciba un array de números y lo devuelva ordenado.
     * 
     * @param args
     */

    public static void main(String[] args) {

        int numero[] = new int[50];

        Arrays.sort(numero);

        pintar(numero);

    }

}
