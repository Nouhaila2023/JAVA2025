package Tema3.ArraysMatrices.ArraysVectores;

public class Ejercicio5 {

    /**
     * Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
     * menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
     * Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array.
     * @param
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void Pintar(int arrays[]){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " | ");
        }
    }

    // Calcular la media
    public static double Media(int numero[]){
        int suma = 0;
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }

        return (double) suma/numero.length;

    }

    // Calcular el mayor
    public static int Mayor(int numero[]) {
        int mayor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] > mayor) {
                mayor = numero[i];
            }
        }
        return mayor;
    }

    // Calcular el menor
    public static int Menor(int numero[]) {
        int menor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        int numero[] = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(0, 10);
        }

        Pintar(numero);
        System.out.println("\nLa media : " + Media(numero));
        System.out.println("El menor : " + Menor(numero));
        System.out.println("El mayor : " + Mayor(numero));

    }
}
