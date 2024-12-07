package Tema3.ArraysMatrices.Matrices;

public class Ejercicio16 {


    /**
     * Crea una matriz de 3x6 números enteros aleatorios no repetidos
     * @param
     */
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void pintar(int matriz[][]) {

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean existe(int matris[][] , int numero){
        for(int i=0; i < matris.length; i++) {
            for(int j=0; j < matris[i].length; j++) {
                if(matris[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int matriz[][] = new int[3][6];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero;
                do {
                    numero = numero_aleatorio(1,50);
                }while (existe(matriz,numero));
                matriz[i][j] = numero;
            }

        }

        pintar(matriz);



    }
}
