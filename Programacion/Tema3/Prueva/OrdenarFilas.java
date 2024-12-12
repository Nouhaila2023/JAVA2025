package Tema3.Prueva;

import java.util.Arrays;

public class OrdenarFilas {

        public static void main(String[] args) {
            int[][] matriz = {
                    {3, 1, 4},
                    {9, 7, 2},
                    {6, 5, 8}
            };

            System.out.println("Matriz original:");
            imprimirMatriz(matriz);

            // Ordenar cada fila
            for (int i = 0; i < matriz.length; i++) {
                Arrays.sort(matriz[i]);
            }

            System.out.println("Matriz con filas ordenadas:");
            imprimirMatriz(matriz);
        }

        public static void imprimirMatriz(int[][] matriz) {


            for (int i = 0; i < matriz.length; i++) { // Recorre filas
                for (int j = 0; j < matriz[i].length; j++) { // Recorre columnas
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Salto de línea después de cada fila
            }
        }




}
