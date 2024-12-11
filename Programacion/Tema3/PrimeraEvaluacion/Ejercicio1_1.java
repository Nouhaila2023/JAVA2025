package Tema3.PrimeraEvaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_1 {

    /*Nos piden crear una matriz 20×20 de números enteros que inicialmente
rellenamos de valores aleatorios (1-100), :*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void pintar(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
/*nos piden hacer un menú con estas opciones*/
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

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
                System.out.println("DIME TU OPCION:)");
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion<1 || opcion>7){
                    System.out.println("Opcion no valida! (1,7)");
                }
            }while(opcion<1 || opcion>7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return opcion;
    }

/*1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
primera por los valores de la segunda.*/

    public static void opcion1(int matriz[][], Scanner sc) {
        int fila1 = -1, fila2 = -1;

        try {
            do {
                System.out.println("Dime la primera fila (1-" + matriz.length + "):");
                fila1 = Integer.parseInt(sc.nextLine()) - 1;
                System.out.println("Dime la segunda fila (1-" + matriz.length + "):");
                fila2 = Integer.parseInt(sc.nextLine()) - 1;


                if (fila1 < 0 || fila1 >= matriz.length || fila2 < 0 || fila2 >= matriz.length) {
                    System.out.println("Error: Las filas deben estar entre 1 y " + matriz.length);
                }

                else if (fila1 == fila2) {
                    System.out.println("Error: Las filas no pueden ser iguales.");
                }

            } while (fila1 < 0 || fila1 >= matriz.length || fila2 < 0 || fila2 >= matriz.length || fila1 == fila2);


            int[] intercambio = matriz[fila1];
            matriz[fila1] = matriz[fila2];
            matriz[fila2] = intercambio;

            System.out.println("Filas intercambiadas correctamente.");
            pintar(matriz);
        } catch (Exception e) {
            System.out.println("Error: Asegúrate de ingresar números válidos.");
        }
    }






/*2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)*/


    public static void opcion2(int matriz[][] , Scanner sc){

        int columna1 = -1 , suma = 0;

        try {

            do {
                System.out.println("Dime la primera columna (1-" + matriz.length + "):");
                columna1 = Integer.parseInt(sc.nextLine()) - 1;

                if (columna1 < 0 || columna1 >= matriz.length) {
                    System.out.println("Error: Las filas deben estar entre 1 y " + matriz.length);
                }

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (j == columna1) {
                            suma += matriz[i][j];
                        }
                    }
                }

                System.out.println("La suma de la columna es: " + suma);


            } while (columna1 < 0 || columna1 >= matriz.length );




        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }


    /*3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas*/
    public static void opcion3(int matriz[][] , Scanner sc){

        int sumaPrincipal = 0 , sumaInversa = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sumaPrincipal += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // i= 0 y j = matriz.length --> i + j = natriz.length
                if (i + j == matriz.length - 1) {
                    sumaInversa += matriz[i][j];
                }
            }
        }

        System.out.println("La suma inversa es: " + sumaInversa);
        System.out.println("La suma preincipal es: " + sumaPrincipal);

    }

    /*4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.*/

    public static void opcion4(int matriz[][] , Scanner sc){

        int mayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("Le mayor numero es: " + mayor);


    }

    /*5. Pinta la matriz traspuesta*/

    public static void opcion5(int matriz[][] , Scanner sc){

        /*
        1 2 3
        4 5 6

        1 4
        2 5
        3 6
         */
        int pintar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                pintar = matriz[j][i];
                System.out.print(pintar + " ");
            }
            System.out.println();
        }
    }

    /*6. Muestra la matriz con las filas ordenadas de mayor a menor*/

    public static void opcion6(int matriz[][] , Scanner sc){


        for (int i = 0; i < matriz.length; i++) {
            //menor a mayor
            Arrays.sort(matriz[i]);

            //mayor a menor
            for (int j = 0; j < matriz[i].length / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][matriz[i].length - 1 - j];
                matriz[i][matriz[i].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

/*7. Salir*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numero_aleatorio(1,100);
            }
        }

        System.out.println("La Matriz Original:)");
        pintar(matriz);

        int opcion = 0;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion1:");
                    opcion1(matriz,sc);
                    break;
                case 2:
                    System.out.println("Opcion2:");
                    opcion2(matriz,sc);
                    break;
                case 3:
                    System.out.println("Opcion3:");
                    opcion3(matriz,sc);
                    break;
                case 4:
                    System.out.println("Opcion4:");
                    opcion4(matriz,sc);
                    break;
                case 5:
                    System.out.println("Opcion5:");
                    opcion5(matriz,sc);
                    break;
                case 6:
                    System.out.println("Opcion6:");
                    opcion6(matriz,sc);
                    break;
                case 7:
                    System.out.println("Salir:) bay");
                    break;
                default:
                    System.out.println("Opcion no valida! (1,7)");
                    break;
            }


        }while (opcion != 7);





    }


}
