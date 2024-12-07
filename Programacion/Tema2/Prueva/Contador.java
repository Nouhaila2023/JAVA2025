package Tema2.Prueva;

import java.util.Scanner;

public class Contador {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*cuantos multiplos de 7 del 1 al 100*/

        /*con while*/

        int contador = 0;
        int i = 1;

        while (i < 100){
            if (i % 7 == 0){
                contador++;
            }
            i++;
        }
        System.out.println("con while " + contador);

        /*con for*/

        for (int j = 1; j <100 ; j++) {
            if (i % 7 == 0){
                contador++;
            }
        }
        System.out.println("Con for " + contador);

        //Tira un dado de seis caras 100 vecas y dime cuantos veces sale el 6


        int tirada;


        for (int j = 1; j < 100 ; j++) {
            tirada = numero_aleatorio(1,6);
            if (tirada == 6){
                contador++;
            }
        }
        System.out.println("Ha salido " + contador + " veces");


        //Tira un dado de seis caras ,1000 vecas y dime porcentaje de veces sale el 6



        for (int j = 1; j < 1000 ; j++) {
            tirada = numero_aleatorio(1,6);
            if (tirada == 6){
                contador++;
            }
        }
        System.out.println("Ha salido " + contador + " veces y " + ((contador*100)/1000) + "%" );


        //suma todos los numero pares del 1 al 100


        /*int total = 0;


        for (int j = 1; j < 100 ; j++) {
            if (j % 2 == 0){
                total += j;
            }

        }

        System.out.println("El total del numeros par desde el 1 al 100: " + total);



        //Pide 5 precios por teclado
        //Imprime el total




        int precio = 0;
        int total = 0;

        for (int j = 0; j < 5; j++) {
            System.out.println("Dime el precio: ");
            precio = sc.nextInt();
            total += precio;
        }

        System.out.println("El total del precio es: " + total + "€");*/

        //create 100 numeros aleatorios entre 1 y 100
        //Muestra la suma de las pares y la suma de las impares

        int numeros;
        int cont1 = 0;
        int cont2 = 0;

        for (int j = 0; j < 100 ; j++) {
            numeros = numero_aleatorio(1,100);
            if (numeros % 2 == 0){
                cont1 += numeros;
            }else {
                cont2 += numeros;
            }
        }

        System.out.println("Los numero pares entre 1 y 100 es: " + cont1);
        System.out.println("Los numero impares entre 1 y 100 es: " + cont2);





    }
}
