package Tema3.ArraysMatrices.ArraysVectores;

public class Ejercicio10 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static boolean buscada(int combinacion[] , int numero){

        for (int i = 0; i < combinacion.length; i++) {

            if (combinacion[i] == numero){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        //Generar combinación Lotería
        //Generar 6 números aleatorios entre 1 y 49 NO REPETIDOS
        //Cada vez que genero un número debo buscar si ya ha salido en la combinación
        // public static boolean buscar(int combinacion[], in numero)
        // Si no está, lo guardo en la combinación, y sigo generando


        int nomerosAl[] = new int[6];
        int numero = 0;


        for (int i = 0; i < nomerosAl.length ; i++) {

            numero = numero_aleatorio(1, 49);
            while (buscada(nomerosAl, numero)) {
                numero = numero_aleatorio(1, 49);
            }

            nomerosAl[i] = numero;

            System.out.println(nomerosAl[i]);
        }


    }
}
