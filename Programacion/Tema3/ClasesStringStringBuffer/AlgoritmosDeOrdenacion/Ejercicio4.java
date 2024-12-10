package Tema3.ClasesStringStringBuffer.AlgoritmosDeOrdenacion;

public class Ejercicio4 {

    public static int numero_aleatorio(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }

    // Método para encontrar el mayor número
    public static int mayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    // Método para encontrar el menor número
    public static int menor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    // Metodo para la media
    public static int media(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    // Pintar

    public static void pintar(int numero[]) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = numero_aleatorio(1, 50);
            System.out.print(numero[i] + " ");
        }
    }

    /**
     * 4. Realiza un programa que cree un vector de 50 posiciones con número
     * aleatorios entre 1 y 50. Una vez
     * creado el vector, el programa deberá mostrar el mayor, el menor y la media de
     * los valores almacenados
     * en el array.
     */

    public static void main(String[] args) {

        int numero[] = new int[50];

        pintar(numero);
        media(numero);
        mayor(numero);
        menor(numero);

        // Calcular y mostrar el mayor, menor y la media
        System.out.println("Mayor número: " + mayor(numero));
        System.out.println("Menor número: " + menor(numero));
        System.out.println("Media: " + media(numero));

    }
}
