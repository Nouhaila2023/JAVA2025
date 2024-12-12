package Tema3.Evaluacion;

import java.util.Scanner;

public class Ejercicio2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuantas rondas quieres jugar (1,5):");
        int ronda = 0;

        do {
            ronda = Integer.parseInt(sc.next());
            if (ronda < 0 || ronda >5){
                System.out.println("Error: numero no valido (1,5)");
            }
        }while (ronda < 0 || ronda >5);


        int Pjugador1 = 40;
        int Pjugador2 = 40;
        int Djugado1;
        int Djugado2;
        int Cjugador1 = 0;
        int Cjugador2 = 0;



        //Dado de Fuego: El perdedor (menor resultado) de la ronda pierde tantos puntos de
        //vida como la diferencia entre ambos resultados.
        System.out.println("Dado de Fuego-----------------------------------------");

        for (int i = 0; i < ronda; i++) {
            Djugado1 = numero_aleatorio(1,6);
            Djugado2 = numero_aleatorio(1,6);

            System.out.println("Ronda " + (i+1));
            System.out.println("La tirada del jugador 1:" +Djugado1);
            System.out.println("La tirada del jugador 2:" + Djugado2);
            if (Djugado1 < Djugado2){
                Pjugador2--;
                Pjugador1++;
            }else {
                Pjugador1--;
                Pjugador2--;
            }


        }

        System.out.println(Pjugador1);
        System.out.println(Pjugador2);

        System.out.println("Dado de Curacion-----------------------------------------");

       //Dado de Curación: Ambos jugadores suman el resultado
       // de su dado a su vida

        for (int i = 0; i < ronda; i++) {
            Djugado1 = numero_aleatorio(1,6);
            Djugado2 = numero_aleatorio(1,6);
            System.out.println("La tirada del jugador 1:" +Djugado1);
            System.out.println("La tirada del jugador 2:" + Djugado2);

            System.out.println("Ronda " + (i+1));
            Pjugador1 += Djugado1;
            Pjugador2 += Djugado2;

        }

        System.out.println("La suma del jugador 1: "+ Pjugador1);
        System.out.println("La suma del jugador 2: "+ Pjugador2);


        System.out.println("Dado de Robo-----------------------------------------");

        for (int i = 0; i < ronda; i++) {

            Djugado1 = numero_aleatorio(1,6);
            Djugado2 = numero_aleatorio(1,6);

            System.out.println("Ronda " + (i+1));
            System.out.println("La tirada del jugador 1:" +Djugado1);
            System.out.println("La tirada del jugador 2:" + Djugado2);

            if (Djugado1 < Djugado2){
                Pjugador2--;

            }else {
                Pjugador1--;
            }
        }

        System.out.println("La suma del jugador 1: "+ Pjugador1);
        System.out.println("La suma del jugador 2: "+ Pjugador2);

        System.out.println("Dado de Explosivo-----------------------------------------");

        for (int i = 0; i < ronda; i++) {

            Djugado1 = numero_aleatorio(1,6);
            Djugado2 = numero_aleatorio(1,6);

            System.out.println("Ronda " + (i+1));
            System.out.println("La tirada del jugador 1:" +Djugado1);
            System.out.println("La tirada del jugador 2:" + Djugado2);

            if (Djugado1 == 6){
                Pjugador2 -= 10;

            }else if (Djugado2 == 6){
                Pjugador1 -= 10;
            }

        }

        System.out.println("La suma del jugador 1: "+ Pjugador1);
        System.out.println("La suma del jugador 2: "+ Pjugador2);







    }

}
