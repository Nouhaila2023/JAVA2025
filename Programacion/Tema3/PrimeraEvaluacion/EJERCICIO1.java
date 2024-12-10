package Tema3.PrimeraEvaluacion;

import java.util.Scanner;

public class EJERCICIO1 {


    /* Nos piden crear una matriz 20×20 de números enteros que inicialmente
     * rellenamos de valores aleatorios (1-100)*/
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }
    public static void pintar(int matriz[][]){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print((matriz[i][j] = numero_aleatorio(1,100)) + " ");
            }
            System.out.println();
        }

    }
    /*nos piden hacer un menú con estas opciones:*/
    /* * 1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
     * primera por los valores de la segunda.*/


    public static void opcion1(int matriz[][] , Scanner sc){

        int fila1 , fila2  ;

        try {
            do {
                System.out.println("Dime las dos filas que quieres cambiar:");
                fila1 = Integer.parseInt(sc.nextLine())-1;
                fila2 = Integer.parseInt(sc.nextLine())-1;
                if (fila1 < 0 || fila1 >= matriz.length || fila2 < 0 || fila2 >= matriz.length){
                    System.out.println("Error => Las filas esta dentro del (1 " + matriz.length + ")");
                }
            }while (fila1 < 1 || fila1 > matriz.length && fila2 < 1 || fila2 > matriz.length);



            int guardarFila[] = matriz[fila1];
            matriz[fila1] = matriz[fila2];
            matriz[fila2] = guardarFila;



        }catch (Exception e){
            System.out.println("Error de filas");
        }





    /*2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)*/
    /**
     *
     * 3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
     * 4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
     * 5. Pinta la matriz traspuesta
     * 6. Muestra la matriz con las filas ordenadas de mayor a menor
     * 7. Salir
     * @param
     */


    public static int menu(){

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("--------------- MENU --------------");
            System.out.println("1) Intercambiar filas--------------");
            System.out.println("2) Suma de una columna-------------");
            System.out.println("3) Sumar diagonales----------------");
            System.out.println("4) Coordenadas del mayor elemento--");
            System.out.println("5) Matriz traspuesta---------------");
            System.out.println("6) Ordenar filas de mayor a menor--");
            System.out.println("7) Salir---------------------------");
            System.out.println("-----------------------------------");



            do {

                System.out.println("Dime tu opcion");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion < 1 || opcion > 7){
                    System.out.println("Hay solo 7 opciones:) --> ententas otre vez.");
                }

            }while (opcion < 1 || opcion > 7);

        }catch (Exception e){
            System.out.println("ERROR: El opcion tiene que estar entre 1 y 7");
            opcion =0;
        }

        return opcion;
    }


    public static void main(String[] args){

            int matriz[][] = new int[20][20];

            pintar(matriz);
            int opcion = 0;

            do {
                opcion = menu();

                switch (opcion) {
                    case 1:
                        System.out.println("Opcion1: Intercambio de filas");
                        opcion1(matriz, sc);
                        break;
                    case 2:
                        System.out.println("Opcion2: Suma de una columna");

                        break;

                    case 3:
                        System.out.println("Opcion3: Sumar diagonales");
                        break;
                    case 4:
                        System.out.println("Opcion4: Coordenadas del mayor elemento");

                        break;
                    case 5:
                        System.out.println("Opcion5: Matriz traspuesta");
                        break;
                    case 6:
                        System.out.println("Opcion6: Ordenar filas de mayor a menor");
                        break;
                    case 7:
                        System.out.println("Opcion7: Salir");
                        break;
                    default:
                        System.out.println("");
                }

                System.out.println("-----------------------");
                pintar(matriz);

            } while (opcion != 7);
        }

    }
}
