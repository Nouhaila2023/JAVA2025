package Tema2.Prueva;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        // Jugador elige
        System.out.println("Elige: piedra, papel o tijera");
        String eleccionJugador = scanner.nextLine().toLowerCase();

        // Generar elección aleatoria para la computadora
        int eleccionComputadora = random.nextInt(3); // 0, 1 o 2
        String eleccionComp = opciones[eleccionComputadora];

        // Mostrar elecciones
        System.out.println("Tu elección: " + eleccionJugador);
        System.out.println("Elección de la computadora: " + eleccionComp);

        // Determinar el ganador
        if (eleccionJugador.equals(eleccionComp)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionJugador.equals("piedra") && eleccionComp.equals("tijera")) ||
                (eleccionJugador.equals("papel") && eleccionComp.equals("piedra")) ||
                (eleccionJugador.equals("tijera") && eleccionComp.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}
