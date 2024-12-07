package Tema3.ArraysMatrices.Matrices;

public class Ejercicio11 {

    public static void main(String[] args) {

        /*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos
         de la diagonal principal sean 1 y el resto 0. Mostrarla.*/

        /**   0  1  2  3  4
         *   .. .. .. .. ..
         *0:  1  0  0  0  0
         *1:  0  1  0  0  0
         *2:  0  0  1  0  0
         *3:  0  0  0  1  0
         *4:  0  0  0  0  1
         */

        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                if (i == j){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }


    }
}
