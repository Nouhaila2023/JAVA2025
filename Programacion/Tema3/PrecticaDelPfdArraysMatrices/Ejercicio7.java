package Tema3.PrecticaDelPfdArraysMatrices;

public class Ejercicio7 {
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void Pintar(int arrays[]){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " | ");
        }
    }

    /**
     * Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
     * derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
     * anterior, pero desplazando N posiciones (N es un número introducido por el usuario).
     * @param
     */

    public static void main(String[] args) {

        int numero[] = new int[5];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(0,10);
            numero[numero.length+1] = numero[numero.length-1];
        }




        Pintar(numero);


    }

}
