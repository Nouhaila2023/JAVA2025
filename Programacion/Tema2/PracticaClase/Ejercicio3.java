package Tema2.PracticaClase;

import java.util.Scanner;

public class Ejercicio3 {

/*Marcus Cubitus y Julius Humerus, dos legionarios romanos aficionados a los dados y
habituales de estos exámenes, han ideado un nuevo juego. Primero se decide cuántos
turnos va a tener la partida (uno por lo menos, lógicamente). En cada turno, cada uno
tira un dado. Si ambos dados son pares o si ambos son impares, Cubitus se apunta la
suma de los dos valores. Si un dado es par y el otro impar, los puntos se los lleva
Humerus. El ganador es el que ha obtenido más puntos.*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int turno;
        int tiradaH , tiradaC;
        int sumaC = 0 , sumaH = 0;
        int totalC = 0 , totalH = 0;

        System.out.println("Cuantos turnos quieres jugar:");
        turno = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= turno ; i++) {

            System.out.println("-----------------------------------");

            tiradaC = numero_aleatorio(1,6);
            System.out.println("Cubitos: " + tiradaC);
            tiradaH = numero_aleatorio(1,6);
            System.out.println("Humerus: " + tiradaH );

            if((tiradaH % 2 == 0 && tiradaC % 2 == 0) ||(tiradaH % 2 != 0 && tiradaC % 2 != 0)){
                sumaC = tiradaC + tiradaH;
                totalC += sumaC;
                System.out.println("Turno" + i + ": *Gana Cubitos*");
            } else {
                sumaH = tiradaH + tiradaC;
                totalH += sumaH;
                System.out.println("Turno" + i +": *Gana Humerus*");
            }

        }

        System.out.println("****************************************");

        System.out.println("Total de puntos de Cubitos:" + totalC);
        System.out.println("Total de puntos de Humeros:" + totalH);

        System.out.println("****************************************");

        if (totalH > totalC){
            System.out.println("Gana Humeros");
        } else if (totalC > totalH) {
            System.out.println("Gana Cubitos");
        }else {
            System.out.println("Empate");
        }

    }
}
