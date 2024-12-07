package Tema3.ArraysMatrices.Matrices;

public class Ejercicio15 {

    public static void pintar(int matriz[][]) {

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = numero_aleatorio(1,10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }
    public static void main(String[] args) {
        /*Crear dos matrices 3x3 de números enteros (generadas aleatoriamente),
        pintarlas, sumarlas y mostrar su suma.
        El resultado será también una matriz (suma) donde cada elemento será la suma de los elementos
        de las otras matrices en la misma posición.*/


        int matric1[][] = new int[3][3];
        int matric2[][] = new int[3][3];

        System.out.println("Premir matriz");
        pintar(matric1);
        System.out.println("Segundo matriz");
        pintar(matric2);

        int suma[][] = new int[3][3];

        System.out.println("La suma ");

        for(int i=0; i < matric1.length; i++) {
            for(int j=0; j < matric1[i].length; j++) {
                suma[i][j] = matric1[i][j] + matric2[i][j];
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }





    }
}
