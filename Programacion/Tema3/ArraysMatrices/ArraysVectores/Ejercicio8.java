package Tema3.ArraysMatrices.ArraysVectores;

import java.util.Scanner;

public class Ejercicio8 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void Pintar(int array[]){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }

    }

    /**
     * Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por
     * teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos
     * @param
     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[10];
        int posicion = 0;

        System.out.println("¿Que posicion quieres?");


        do {
            System.out.println("El posicion tiene que estar entre 0 y 9 :)");
            posicion = Integer.parseInt(sc.nextLine());
        }while (!(posicion <= tabla.length && posicion >= 0));


        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = numero_aleatorio(1,10);
        }

        System.out.println("EL primer array :)");
        Pintar(tabla);

        System.out.println("\n--------------------------------");

        System.out.println("El array menos el pocicions " + posicion );

        int nuevoArray[] = new  int[tabla.length-1];
        int pocicionQuerida = 0;

        for (int i = 0; i < tabla.length  ; i++) {

            if (i != posicion){
                nuevoArray[pocicionQuerida] = tabla[i];
                pocicionQuerida++;
            }
        }

        Pintar(nuevoArray);

        sc.close();



    }
}
