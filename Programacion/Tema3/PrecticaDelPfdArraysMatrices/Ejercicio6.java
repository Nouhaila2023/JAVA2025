package Tema3.PrecticaDelPfdArraysMatrices;

public class Ejercicio6 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    /**
     * Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
     * segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.
     * @param
     */

    public static void main(String[] args) {

        int numero[] = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1, 10);
            System.out.print(numero[i] + " ");
        }

        System.out.println("\n--------------------------");
        for (int i = 0; i < numero.length/2; i++) {
            System.out.print(numero[i] + " ");
            System.out.print(numero[numero.length-i-1] + " ");
        }


    }
}
