package Tema3.Prueva;
import java.util.Scanner;
public class EliminarPosisionArrays {





        public static int numero_aleatorio(int min , int max){
            return (int)(Math.random()*(max-min+1) +min);
        }

        public static void Pintar(int array[]){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " | ");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int tabla[] = new int[10];
            int posicion = 0;

            System.out.println("¿Qué posición quieres eliminar?");

            do {
                System.out.println("La posición tiene que estar entre 0 y 9 :)");
                posicion = Integer.parseInt(sc.nextLine());
            } while (!(posicion <= 9 && posicion >= 0));

            // Generating random numbers for the array
            for (int i = 0; i < tabla.length; i++) {
                tabla[i] = numero_aleatorio(1, 10);
            }

            // Displaying the initial array
            System.out.println("Array inicial:");
            Pintar(tabla);

            // Removing the element by shifting the others
            for (int i = posicion; i < tabla.length - 1; i++) {
                tabla[i] = tabla[i + 1];
            }

            // Set the last element to 0 (or any other value you prefer)
            tabla[tabla.length - 1] = 0;

            System.out.println("\nArray después de eliminar el elemento en la posición " + posicion + ":");
            Pintar(tabla);

            sc.close();

    }

}
