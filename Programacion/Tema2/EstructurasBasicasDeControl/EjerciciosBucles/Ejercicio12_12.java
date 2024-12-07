package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

public class Ejercicio12_12 {

    public static void main(String[] args) {

        // Fila1    *******   0e 4* 3*
        // Fila2     *****    1e 3* 2* 1e
        // Fila3      ***     2e 2* 1* 2e
        // Fila4       *      3e 1* 0* 3e

        for(int i = 1; i <= 4; i++) {

            //entra en la fila 2, 3, 4
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }


            for(int j = 4; j >= i; j--) {
                System.out.print("*");
            }

            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}