package Tema3.Evaluacion;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    //Valores aleatorios(1-100)
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    //Metodo para Pintar el matriz
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
            System.out.println("-------------------------- MENU ---------------------------------");
            System.out.println("1) Intercambiar columnas-----------------------------------------");
            System.out.println("2) Suma de una fila----------------------------------------------");
            System.out.println("3) Sumar diagonales----------------------------------------------");
            System.out.println("4) Compruba si la diagonal prencipal y la inversa son iguales----");
            System.out.println("5) El menor numero del matriz------------------------------------");
            System.out.println("6) Salir---------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------");
            do {
                System.out.println("DIME TU OPCION:)");
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion<1 || opcion>6){
                    System.out.println("Opcion no valida! (1,6)");
                }
            }while(opcion<1 || opcion>6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return opcion;
    }


    //Intercambiar columna. Te pedirá dos números de columna e intercambiará los
    //valores de la primera por los valores de la segunda


    public static void opcion1(int matriz[][] , Scanner sc){

        int columna1 = -1, columna2 = -1;

        try {
            do {
                System.out.println("Dime el primera columna (1-" + matriz.length + "):");
                columna1 = Integer.parseInt(sc.nextLine()) - 1;
                System.out.println("Dime el segunda columna (1-" + matriz.length + "):");
                columna2 = Integer.parseInt(sc.nextLine()) - 1;


                if (columna1 < 0 || columna1 >= matriz.length || columna2 < 0 || columna2 >= matriz.length) {
                    System.out.println("Error: Las columna deben estar entre 1 y " + matriz.length);
                }

                else if (columna1 == columna2) {
                    System.out.println("Error: Las columna no pueden ser iguales.");
                }

            } while (columna1 < 0 || columna1 >= matriz.length || columna2 < 0 || columna2 >= matriz.length || columna1 == columna2);


            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    int intercambio = matriz[i][columna1];
                    matriz[i][columna1] = matriz[i][columna2];
                    matriz[i][columna2] = intercambio;

                }
            }

            System.out.println("Filas intercambiadas correctamente.");
            pintar(matriz);
        } catch (Exception e) {
            System.out.println("Error: Asegúrate de ingresar números válidos.");
        }

    }


    //sumar fila que pide el usuario
    public static int opcion2(int matriz[][] , Scanner sc){
        int fila = -1;

        try {

            System.out.println("Dima la fila que quieres sumala:");
            fila = Integer.parseInt(sc.nextLine()) -1;

            int sumaFila = 0;

            if (fila < 0 || fila >= matriz.length) {
                System.out.println("Error: Las filas deben estar entre 1 y " + matriz.length);
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == fila) {
                        sumaFila += matriz[i][j];
                    }
                }
            }
            System.out.println("Suma de la Fila " + fila + " --> " + sumaFila);

        }catch (Exception ex){
            System.out.println("Error");
        }


        return fila;
    }

    public static void opcion3(int matriz[][]){

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
                if (i + j == matriz.length - 1) {
                    sumaInversa += matriz[i][j];
                }
            }
        }

        System.out.println("La suma inversa es: " + sumaInversa);
        System.out.println("La suma preincipal es: " + sumaPrincipal);



        if (sumaInversa == sumaPrincipal){
            System.out.println("Son iguales.");
        }else {
            System.out.println("No son iguales");
        }



    }



    public static int opcion4(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("El menor numero del matriz es: " + menor );
        return menor;
    }


    // Ordenar cada fila del menor al mayor
    public static void opcion5(int[][] matriz){


        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

        pintar(matriz);


    }




    public static void main(String[] args) {

/* Nos piden crear una matriz 20×20 de números enteros que inicialmente
rellenamos de valores aleatorios (1-100), */

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
                    opcion1(matriz ,sc);
                    break;
                case 2:
                    System.out.println("Opcion2:");
                    opcion2(matriz ,sc);
                    break;
                case 3:
                    System.out.println("Opcion3:");
                    opcion3(matriz);
                    break;
                case 4:
                    System.out.println("Opcion4:");
                    opcion4(matriz);
                    break;
                case 5:
                    System.out.println("Opcion5:");
                    opcion5(matriz);
                    break;
                case 6:
                    System.out.println("Salir:) ");
                    break;
                default:
                    System.out.println("Opcion no valida! (1,6)");
                    break;
            }


        }while (opcion != 6);


    }
}
