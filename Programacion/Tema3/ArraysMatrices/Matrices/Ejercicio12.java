package Tema3.ArraysMatrices.Matrices;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Crear una matriz “marco” de tamaño 8x6. Una matriz “marco”
        es aquella que todos sus elementos son 0 salvo los
        de los bordes que deben ser 1. Mostrarla.*/

        /**
         * 1 1 1 1 1 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 1 1 1 1 1
         */

        int marco[][] = new int[8][6];

        //fila ---  de 0 a 7
        for (int i = 0; i < marco.length; i++) {
            //culomna |||  de 0 a 5
            for (int j = 0; j < marco[i].length; j++) {

                if (i == 0 || i== marco.length-1 || j == 0 || j == marco[i].length-1 ){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }



    }
}
