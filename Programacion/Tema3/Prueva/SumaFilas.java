package Tema3.Prueva;

public class SumaFilas {

    public class Main {
        public static void main(String[] args) {
            int[][] matriz = {
                    {3, 1, 4},
                    {9, 7, 2},
                    {6, 5, 8}
            };

            System.out.println("Matriz:");
            imprimirMatriz(matriz);

            System.out.println("Suma de las filas:");
            for (int i = 0; i < matriz.length; i++) {
                int sumaFila = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + (i + 1) + ": " + sumaFila);
            }
        }

        public static void imprimirMatriz(int[][] matriz) {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        }
    }



}
