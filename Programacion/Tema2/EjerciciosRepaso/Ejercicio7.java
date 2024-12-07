package Tema2.EjerciciosRepaso;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Ejercicio7 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static String Jugada(int jugada){

        switch (jugada){

            case 1:
                return "Piedra";

            case 2:
                return "Papel";

            case 3:
                return "Tijera";

            default:
                return "sin valido";

        }

    }

    public static String Ganador(int jugador1 , int jugador2){

        if (jugador1 == jugador2){
            return "Empate";
        } else if ((jugador1 == 2 && jugador2 == 1) || (jugador1 == 3 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 3)) {
            return "Gana el jugador 1";
        }else {
            return "Gana el jugador 2";
        }

    }

    public static void main(String[] args) {

        /*Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
        tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de
        partidas a jugar y al final indica cuántas partidas ha ganado cada uno.*/

        Scanner sc = new Scanner(System.in);

        int partida = 0;
        int ganadasJugador1 = 0 , ganadasJugador2 = 0 ;
        int tiradaJugador1 = 0 , tiradaJugador2 = 0 ;

        System.out.println("Dima cuantos partidas quieres: ");
        partida = sc.nextInt();

        for (int i = 0; i < partida ; i++) {

            tiradaJugador1 = numero_aleatorio(1,3);
            tiradaJugador2 = numero_aleatorio(1,3);

            System.out.println("PARTIDA -> " + (i+1));

            System.out.println("Jugador1: " + Jugada(tiradaJugador1));
            System.out.println("Jugador2: " + Jugada(tiradaJugador2) );

            String resultado = Ganador(tiradaJugador1,tiradaJugador2);
            System.out.println(resultado + "\n" );

            //contamos la victoria de cada uno

            if (resultado.equals("Gana el jugador 1")){
                ganadasJugador1++;
            }else {
                ganadasJugador2++;
            }

        }

        System.out.println("Jugador1 a ganado: " + ganadasJugador1 + " partidas");
        System.out.println("Jugador2 a ganado: " + ganadasJugador2 + " partidas");

        sc.close();


    }
}
