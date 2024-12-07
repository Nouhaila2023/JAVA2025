package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioIf6 {
    public static void main(String[] args) {

        // VidaJugador = 0-100
        // VidaMonstruo = 0-50
        // PuntosEspada = 0-50
        // RunaMagica = true/false

        int VidaJugador, VidaMonstruo , PuntosEspada ;
        boolean RunaMagica;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tntrega la vida del jugador:");
        VidaJugador = sc.nextInt();
        System.out.println("Tntrega la vida del monstruo:");
        VidaMonstruo = sc.nextInt();
        System.out.println("Tntrega la puntos espada:");
        PuntosEspada = sc.nextInt();
        System.out.println("Tntrega la runa magica:");
        RunaMagica = sc.nextBoolean();


        // Es un combate entre el jugador y el monstruo.
        // Gana el jugador si:
        //          - VidaJugador > 50 y PuntosEspada > 30
        //          - VidaJugador < 50 y PuntosEspada > 50
        //          - VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

        // Gana el monstruo si:
        //          - Si la vida del jugador es menor de 50 y los puntos
        //          de la espada menor que 50,
        //          O si la vida del jugador es menor de 50 y RunaMagica = false


        if (VidaJugador > 50 && PuntosEspada > 30 || VidaJugador < 50 && PuntosEspada > 50 || VidaJugador < 50 && PuntosEspada < 30 && RunaMagica == true) {
            System.out.println("Gana El Jugador");
        } else if (VidaJugador < 50 && PuntosEspada < 50 || VidaJugador < 50 && RunaMagica == false){
            System.out.println("Gana El Monstruo");}


        sc.close();

    }
}
