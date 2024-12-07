package Tema3.Prueva;

public class Matris3 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {
        /**
         * Ej1 - Crea un matriz de 6x6 de entros. Rellenala de valores aleattorias y
         * dime la suma de la diagonal principal y de la diagpnal secundaria
         *

        int num[][] = new int[6][6];

        double sumaP = 0 ,sumaS = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = numero_aleatorio(1,10);
                System.out.print(num[i][j] + "  ");

                if (i == j){
                    sumaP += num[i][j];
                }

                if (i + j  == num.length-1){
                    sumaS += num[i][j];
                }

            }
            System.out.println();

        }

        System.out.println("La suma de diagonal principal es: " + sumaP);
        System.out.println("La suma de diagonal segundaria es: " + sumaS);
        */


        int numero[][] = new int[7][3];
        int suma = 0;


        for (int i = 0; i < numero.length; i++) {

            for (int j = 0; j < numero[i].length; j++) {

                numero[i][j] = numero_aleatorio(1,10);
                suma += numero[j][i];
                System.out.print(numero[i][j] + " ");
            }

        }

        for (int j = 0; j < numero.length; j++) {
            System.out.println("La suma de cada culomna -< " + suma + " >-");
        }

    }
}
