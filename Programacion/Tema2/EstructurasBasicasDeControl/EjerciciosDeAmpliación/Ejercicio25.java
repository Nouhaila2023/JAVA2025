package Tema2.EstructurasBasicasDeControl.EjerciciosDeAmpliación;

import java.util.Scanner;

public class Ejercicio25 {

    /*Marcus Cubitus y Julius Humerus se encuentran en racha y prueban un juego nuevo. Una partida de
este juego consiste en varios turnos. En cada uno de ellos, un jugador tira cuatro dados y el otro
jugador tira sólo uno. Si el segundo jugador saca un valor distinto a los del primero, gana un punto,
pero si saca alguno de los valores sacados por el primero, es el primer jugador quien gana un punto.
Escriba un programa que muestre una partida de este juego, detallando quién gana el punto en cada
turno y la puntuación final de cada jugador*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tida1_1, tida1_2, tida1_3, tida1_4, tida2_1;
        int puntosJ2 = 0 , puntosJ1 = 0;
        int turno = 0;


        System.out.println("Cuantos turnos quieres:");
        turno = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= turno ; i++) {

            tida1_1 = numero_aleatorio(1,6);
            tida1_2 = numero_aleatorio(1,6);
            tida1_3 = numero_aleatorio(1,6);
            tida1_4 = numero_aleatorio(1,6);
            tida2_1 = numero_aleatorio(1,6);

            System.out.println("tirada1_1 --> " + tida1_1 );
            System.out.println("tirada1_2 --> " + tida1_2 );
            System.out.println("tirada1_3 --> " + tida1_3 );
            System.out.println("tirada1_4 --> " + tida1_4 );
            System.out.println("tirada2_1 --> " + tida2_1 );


            if (tida2_1 != tida1_1 && tida2_1 != tida1_2 && tida2_1 != tida1_3 && tida2_1 != tida1_4){
                puntosJ2++;

            }else {
                puntosJ1++;
            }
        }

        System.out.println("------------------------------");
        System.out.println("Puntos de jugador 1: " + puntosJ1);
        System.out.println("Puntos de jugador 2: " + puntosJ2);


        if (puntosJ1 > puntosJ2) {
            System.out.println("Ha ganado el jugador 1");
        } else if (puntosJ1 == puntosJ2) {
            System.out.println("Empate");
        }else {
            System.out.println("Ha ganado el jugaror 2");
        }


    }

}
