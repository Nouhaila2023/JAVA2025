package Tema3.ArraysMatrices.ArraysVectores;

import java.util.Scanner;

public class Ejercicio3 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }


    /**
     * Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
     * y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
     * que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10
     * posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo
     * array finalizamos.
     * @param
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el tamaño:");
        int tamaño = sc.nextInt();
        System.out.println("Dime el numero acabado querido:");

        int numeroacabado;

        do {
            numeroacabado = sc.nextInt();
            if (numeroacabado <= 0 && numeroacabado >= 10){
                System.out.println("Error pide un numero entre 1 y 9");
            }
        }while (!(numeroacabado >=1 && numeroacabado <= 9));


        int numeros[] = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = numero_aleatorio(1,300);
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n-------------------------");

        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] % 10 == numeroacabado) {
                System.out.print(numeros[i] + " ");
            }
        }



    }
}
