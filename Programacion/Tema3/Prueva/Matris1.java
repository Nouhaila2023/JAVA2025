package Tema3.Prueva;

public class Matris1 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        int[][] precio = new int[3][5];

        precio[0][4] = 34;
        precio[2][1] = 5;

        for (int i = 0; i < precio.length; i++) {
            for (int j = 0; j < precio[i].length; j++) {
                System.out.print(precio[i][j] + " ");
            }
            System.out.println();
        }

    }
}
