package Tema3.ArraysMatrices.Matrices;

public class Ejercicio18 {
    /**
     * Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
     * introducir en un array de 4 filas por 5 columnas.
     * El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
     * suma total debe aparecer en la esquina inferior derecha.
     * @param
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void pintar(int matriz[][]) {

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int numero[][] = new int[5][6];

        for(int i=0; i < 4; i++) {
            for(int j=0; j < 5; j++) {
                numero[i][j] = numero_aleatorio(1,5);
                numero[i][5] += numero[i][j];
                numero[4][j] += numero[i][j];
                numero[4][5] += numero[i][j];

            }
        }

        pintar(numero);


    }
}
