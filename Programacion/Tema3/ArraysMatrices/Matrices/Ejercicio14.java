package Tema3.ArraysMatrices.Matrices;

public class Ejercicio14 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    // Método para encontrar el mayor número en la matriz
    public static int Mayor(int[][] tabla) {
        int mayor = tabla[0][0];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > mayor) {
                    mayor = tabla[i][j];
                }
            }
        }
        return mayor;
    }

    // Método para encontrar el menor número en la matriz
    public static int Menor(int[][] tabla) {
        int menor = tabla[0][0];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] < menor) {
                    menor = tabla[i][j];
                }
            }
        }
        return menor;
    }



    public static void main(String[] args) {
        /*4. Crear una matriz 5x3 de números enteros (aleatorios) y
        mostrar el menor, el mayor y la media de los elemento*/

        int tabla[][] = new  int [5][3];
        int suma = 0;
        double media;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = numero_aleatorio(1,10);
                suma += tabla[i][j];
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.println("La suma de los numero es:" + suma);
        media = suma/tabla.length;
        System.out.println("La media de los numero es:" + media);

        int mayor = Mayor(tabla);
        int menor = Menor(tabla);
        System.out.println("------------------------------------------");
        System.out.println("El mayor es:" + mayor);
        System.out.println("El menor es:" + menor);


    }
}
