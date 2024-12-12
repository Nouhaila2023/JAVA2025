package Tema3.Prueva;
import java.util.Arrays;

public class OrdenarColumnaz {

    public class Main {
        public static void main(String[] args) {
            int[][] matriz = {
                    {3, 1, 4},
                    {9, 7, 2},
                    {6, 5, 8}
            };

            System.out.println("Matriz original:");
            imprimirMatriz(matriz);

            // Ordenar cada columna
            for (int j = 0; j < matriz[0].length; j++) { // Recorre columnas
                int[] columna = new int[matriz.length];
                for (int i = 0; i < matriz.length; i++) {
                    columna[i] = matriz[i][j];
                }
                Arrays.sort(columna); // Ordenar la columna
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j] = columna[i];
                }
            }

            System.out.println("Matriz con columnas ordenadas:");
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





}
