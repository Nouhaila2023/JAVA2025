package Tema3.Prueva;

public class Matris2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /**
         * Ej2 - Crea un matriz de 7x3 de double. Relleanala de valor aleatorios u
         * dime la suma de cada una de las columnas*/

        int numero[][] = new int[7][3];
        int suma = 0;


        for (int i = 0; i < numero.length; i++) {

            for (int j = 0; j < numero[i].length; j++) {

                numero[i][j] = numero_aleatorio(1,9);
                System.out.print(numero[i][j] + " ");

            }
            System.out.println();
        }

        for (int j = 0; j < numero.length; j++) {
            System.out.println("La suma de cada culomna -< " + suma + " >-");
        }










    }
}
