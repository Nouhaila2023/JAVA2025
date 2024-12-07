package Ejercicios_Udemy.Variables;

public class Exit {
    public static void main(String[] args) {
        // Imprimir un mensaje de inicio
        System.out.println("El programa ha iniciado.");

        // Condición para finalizar el programa
        if (true) {
            System.out.println("Finalizando el programa exitosamente.");
            System.exit(0);  // Termina el programa exitosamente
        }

        // Este código no se ejecutará
        System.out.println("Este mensaje no se imprimirá.");
    }
}
