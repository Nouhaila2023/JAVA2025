package Tema3.ArraysMatrices.ArraysVectores;

public class
Ejercicio1 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente
        entre -100 y 100.
        A continuación, se recorre el array y calcula cuántos números son positivos y cuántos
        negativos*/

        int numero[] = new int[20];
        int contadorNegativo = 0;
        int contadorPositivo = 0;

        for (int i = 0; i <numero.length ; i++) {

            numero[i] = numero_aleatorio(100,(-100));
            System.out.println(numero[i]);

            if (numero[i] <= 0){
                contadorNegativo++;
            }else {
                contadorPositivo++;
            }

        }

        System.out.println("Hay " + contadorNegativo + " negativos de elementos de array");
        System.out.println("hay " + contadorPositivo + " positivos de elementos de array");
    }
}
