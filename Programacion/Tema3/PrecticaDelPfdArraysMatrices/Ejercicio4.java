package Tema3.PrecticaDelPfdArraysMatrices;

import java.util.Scanner;

public class Ejercicio4 {

    public static void Pintar(int arrays[]){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " | ");
        }
    }
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    /**
     * Programa Java para leer la altura de N personas y calcular la altura media.
     * Calcular cuántas personas tienen una altura superior a la media y cuántas tienen
     * una altura inferior a la media. El valor de N se pide por teclado y debe
     * ser entero positivo.
     * @param
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas hay N:");

        int N = Integer.parseInt(sc.next());
        int altura[] = new int[N];
        int media = 0;
        int suma = 0;

        int contadorS = 0, contadorI = 0;
        for (int i = 0; i < N; i++) {

            altura[i] = numero_aleatorio(100,200);
            suma += altura[i];
            media = suma / N;

            if (altura[i] >= media){
                contadorS++;
            }else {
                contadorI++;
            }
        }

        Pintar(altura);
        System.out.println("\nLa media de altura es: " + media);

        System.out.println("Hay *" + contadorS + "* altura soperior a la media");
        System.out.println("Hay *" + contadorI + "* altura inferior a la media");



    }
}
