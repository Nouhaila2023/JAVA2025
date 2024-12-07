package Tema3.PrimeraEvaluacion;

import java.util.Scanner;

public class Ejercicio1 {


    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void Pintar(int matriz[][]){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }

    }

    /*nos piden hacer un menú con estas opciones:*/
    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        int opcions = 0;
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
                opcions = Integer.parseInt(sc.nextLine());

                if (opcions < 1 || opcions > 7) {
                    System.out.println("Hay solo 7 opciones Gracias --> Intentas otra ves");
                }

            }while (opcions < 1 || opcions > 7);




        } catch (Exception e) {
            System.out.println("ERROR: El opcion tiene que estar entre 1 y 7");
            opcions =0;
        }



       return opcions;
    }


    /* * 1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
     * primera por los valores de la segunda.*/

    public static void Opcion1(int matriz[][] , Scanner sc ){

        int fila1, fila2;

        try {
            do {
                System.out.println("Dime la premes fila: ");
                fila1 = Integer.parseInt(sc.nextLine()) -1;
                System.out.println("Dime la segunada fila:");
                fila2 = Integer.parseInt(sc.nextLine()) -1;

                if(!(fila1 > 0 || fila1 <= matriz.length || fila2 > 0 || fila2 <= matriz.length)){
                    System.out.println("La numeros de fila entre 1  y " + matriz.length);
                }
            }while (!(fila1 > 0 || fila1 <= matriz.length || fila2 > 0 || fila2 <= matriz.length));

            int intrecambio[] = matriz[fila1];
            matriz[fila1] = matriz[fila2];
            matriz[fila2] = intrecambio;

        } catch (Exception e) {
            System.out.println("Error");
        }



    }

/*2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)*/
    public static void Opcion2(int matriz[][] ,Scanner sc){

        int columna;

        int suma = 0;

        try {
            System.out.println("Dime la columna quireda: ");
            columna = Integer.parseInt(sc.nextLine()) - 1;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == columna) {
                        suma += matriz[i][j];
                    }
                }
            }

            System.out.println("La suma de la columna " + columna + ": " + suma);

        }catch (Exception e){
            System.out.println("ERROR:");
        }

    }

    /**
     *
     * 3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
     * 4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
     * 5. Pinta la matriz traspuesta
     * 6. Muestra la matriz con las filas ordenadas de mayor a menor
     * 7. Salir
     * @param
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Nos piden crear una matriz 20×20 de números enteros que inicialmente
                * rellenamos de valores aleatorios (1-100)*/
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numero_aleatorio(1,100);
            }
        }

        /*Pintar el origin Matriz*/
        System.out.println("La Matrez Oreginal:");
        Pintar(matriz);

        int opcion = 0;

        do {
            opcion = Menu();

            switch (opcion){
                case 1:
                    System.out.println("Opcion1: Intercambio de filas");
                    Opcion1(matriz,sc);
                    break;
                case 2:
                    System.out.println("Opcion2: Suma de una columna");
                    Opcion2(matriz,sc);
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
                    System.out.println("b");
            }

            System.out.println("-----------------------");
            Pintar(matriz);

        }while (opcion != 7);


    }
}
