package Tema3.ArraysMatrices.ArraysVectores;

import java.util.Scanner;

public class Ejercicio4 {


    /*Programa Java para leer la altura de N personas y calcular la altura media.
    Calcular cuántas personas tienen una
    altura superior a la media y cuántas tienen una altura inferior a la media.
    El valor de N se pide por teclado y debe
    ser entero positivo.*/

    public static double numero_aleatorio(double min , double max){

        return (double) (Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas personas hay?");
        int N = sc.nextInt();
        double altura[] = new double[N];
        double media;
        int suma = 0;
        String format;

        System.out.print("Las alturas que hay: ");
        for (int i = 0; i < N; i++) {
            altura[i] = numero_aleatorio(100,200);
            format = String.format("%.2f", altura[i]);
            System.out.print(format + " | ");
            suma += altura[i];

        }

        System.out.println("\nLa alotal de altura: " + suma);

        media = suma / N;
        System.out.println("La media: " + media);


        int superiores = 0, inferiores = 0;

        for (int i = 0; i < N; i++) {
            if (altura[i] > media){
                superiores++;
            }else {
                inferiores++;
            }
        }

        System.out.println("Hay " + superiores +  "  superiores");
        System.out.println("Hay " + inferiores +  "  superiores");





    }
}
