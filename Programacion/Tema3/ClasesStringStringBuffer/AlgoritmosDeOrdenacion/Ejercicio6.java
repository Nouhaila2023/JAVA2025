package Tema3.ClasesStringStringBuffer.AlgoritmosDeOrdenacion;

import java.util.Arrays;

public class Ejercicio6 {

    public static int numero_aleatorio(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }

    /*
     * Realiza un programa que cree un vector de 100 posiciones con números
     * aleatorios entre 1 y 100. Una
     * vez creado el vector, el programa deberá ordenarlo y mostrar los números
     * entre 1 y 100 que no han
     * sido almacenados. Ten en cuenta a la hora de buscar un número en un array que
     * no tienes que comparar con todo el array puesto que ya está ordenado.
     */
    public static void main(String[] args) {

        int numero[] = new int[100];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1, 100);
        }

        Arrays.sort(numero);
        System.out.print(Arrays.toString(numero));
        System.out.println("\nLos numeros que no hay en el array:\n");

        boolean encontrar;

        for (int i = 1; i <= numero.length; i++) {
            encontrar = false;
            for (int j = 0; j < numero.length; j++) {

                if (i == numero[j]) {
                    encontrar = true;
                    break;
                }
                // no continuar de buscar como si es ordenado
                if (numero[j] > i) {
                    break;
                }
                if (!encontrar) {
                    System.out.print(i + " - ");
                }
            }
        }
    }
}
