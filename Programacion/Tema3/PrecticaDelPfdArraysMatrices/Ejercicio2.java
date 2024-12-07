package Tema3.PrecticaDelPfdArraysMatrices;

public class Ejercicio2 {

    /**
     * Crea una función que reciba como parámetro un array de 10 enteros,
     * debe devolver el mismo array donde se
     * hayan intercambiado el primer elemento y el último elemento
     * @param
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void Pintar(int arrays[]){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " | ");
        }
    }

    public static void main(String[] args) {

        int numero[] = new int[10];

        int guardar =0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(0,10);
        }

        Pintar(numero);

        System.out.println();

        guardar = numero[0];
        numero[0] = numero[numero.length-1];
        numero[numero.length-1] = guardar;


        System.out.println(numero[0]);
        System.out.println(guardar);

        Pintar(numero);







    }
}
