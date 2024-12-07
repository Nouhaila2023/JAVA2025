package Tema3.Prueva.EjercicioClase;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * 3. Simulación de contaminación
     * Tenemos una ciudad dividida en cuadrantes, una matriz NxM, decide tú.
     * Cada celda contiene un número entre 0 y 100 indicando el nivel de contaminación.
     * Pinta una nueva matriz, marcando con un 0 las zonas con contaminación menor a un umbral,
     * p. ej. 10, con un 1 las zonas entre 10 y 80, y con un 2 las zonas con más de 80.
     * Dime la coordenadas (i,j) de las zonas con mas de 80 de contaminacion
     * Dime también el nivel de contaminación promedio de la ciudad
     */
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N , M;

        System.out.println("Dime El numero N:");
        N = Integer.parseInt(sc.nextLine());
        System.out.println("Dime el numero M:");
        M = Integer.parseInt(sc.nextLine());

        int matriz1[][]  = new int[N][M];
        int suma = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = numero_aleatorio(0,100);
                System.out.print(matriz1[i][j] + "  ");
                suma += matriz1[i][j];
            }
            System.out.println();
        }



        System.out.println("---------------------------------------------");

        int matriz2[][] = new int[N][M];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if (matriz1[i][j] < 10 ){
                    matriz2[i][j] = 0;
                } else if (matriz1[i][j] >= 10 || matriz1[i][j] < 80) {
                    matriz2[i][j] = 1;
                }else {
                    matriz2[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");

        System.out.println("La suma: " + suma);
        System.out.println("El promedio: " + (suma/matriz1.length));
    }
}
