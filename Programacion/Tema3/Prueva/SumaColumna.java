package Tema3.Prueva;

public class SumaColumna {

    public class Main {
        public static void main(String[] args) {
            int[][] matriz = {
                    {3, 1, 4},
                    {9, 7, 2},
                    {6, 5, 8}
            };

            System.out.println("Matriz:");
            imprimirMatriz(matriz);

            System.out.println("Suma de las columnas:");
            for (int j = 0; j < matriz[0].length; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < matriz.length; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
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
