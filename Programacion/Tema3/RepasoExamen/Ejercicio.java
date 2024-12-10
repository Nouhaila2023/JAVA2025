package Tema3.RepasoExamen;

public class Ejercicio {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void pintar(char numero[][]) {

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        char tabla[][] = new char[20][20];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = '.';
                tabla[i][0] = '|';
                tabla[i][tabla.length - 1] = '|';
                tabla[0][i] = '-';
                tabla[tabla.length - 1][j] = '-';
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {

            }
        }

        pintar(tabla);

    }

}
