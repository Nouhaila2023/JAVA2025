package Tema3.StringStringBuffer;

import java.util.Arrays;

public class Ejercicio1_1 {

    // Función para generar números aleatorios entre min y max
    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // Método de la burbuja para ordenar el arreglo
    public static int[] metodoBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Crear un arreglo de 50 elementos
        int[] numero = new int[50];

        // Llenar el arreglo con números aleatorios entre 1 y 100
        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1, 100);
        }

        // Mostrar el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(numero));

        // Ordenar el arreglo con el método de la burbuja
        int[] arregloOrdenado = metodoBurbuja(numero);

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(arregloOrdenado));
    }

}
