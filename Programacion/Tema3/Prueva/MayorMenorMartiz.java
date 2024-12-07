package Tema3.Prueva;

public class MayorMenorMartiz {
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

}
