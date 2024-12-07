package Tema3.ArraysMatrices.ArraysVectores;

public class Ejercicio7 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {
        /*Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
anterior, pero desplazando N posiciones (N es un número introducido por el usuario).*/

         int numero[] = new int[5];


        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1,10);
            System.out.println(numero[i]);
        }

        System.out.println("");

        int temporal = numero[numero.length - 1];


        for (int i = numero.length-1 ; i > 0 ; i--) {
            numero[i] = numero[i-1];
            System.out.println(numero[i]);
        }

        numero[0] = temporal;
        System.out.println(temporal);





    }
}
