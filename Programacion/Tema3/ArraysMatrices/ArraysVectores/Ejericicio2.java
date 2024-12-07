package Tema3.ArraysMatrices.ArraysVectores;

public class Ejericicio2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /* Crea una función que reciba como parámetro un array de 10 enteros,
        debe devolver el mismo array donde se
        hayan intercambiado el primer elemento y el último elemento.*/


        int numero[] = new int[10];
        int intrecambio = 0;


        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1,10);
            System.out.print(numero[i] + " ");

        }

        intrecambio = numero[0];
        numero[0] = numero[numero.length -1];
        numero[numero.length -1] = intrecambio;

        // Mostramos el array despues del intercambio
        System.out.println("\nArray Cambiado");
        for (int i = 0; i < numero.length; i++){
            System.out.print(numero[i]+ " ");
        }



    }
}
