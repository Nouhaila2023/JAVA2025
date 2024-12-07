package Tema3.PrecticaDelPfdArraysMatrices;

public class Ejercicio1 {


    /**
     * . Programa Java que guarda en un array 20 números enteros que se generen
     * aleatoriamente entre -100 y 100.
     * A continuación, se recorre el array y calcula cuántos
     * números son positivos y cuántos negativos
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

        int numero[] = new int[20];

        int contadorP = 0 , contadorN = 0;
        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(100,-100);
            if (numero[i] >= 0){
                contadorP++;
            }else {
                contadorN++;
            }

        }

        Pintar(numero);

        System.out.println("\nHay " + contadorP + " numeros Positivos");
        System.out.println("Hay " + contadorN + " numeros Negativos");

    }
}
