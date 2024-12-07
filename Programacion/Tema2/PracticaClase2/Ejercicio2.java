package Tema2.PracticaClase2;

import java.util.Scanner;

public class Ejercicio2 {

    /*Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
    aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos.
    Pide por teclado un número de turnos que van a jugar. En cada turno Cubitus lanza cuatro
    dados de 10 caras y se anota la suma de los valores impares obtenidos, mientras que el
    Humerus lanza tres dados de 15 caras y se anota la suma de los valores pares obtenidos.
    Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya
    ganado más turnos.
    ¿Es un juego equitativo? ¿Cómo lo comprobarías?*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int turno;
        int sumaC = 0 , sumaH = 0;
        int contadorC = 0 , contadorH = 0;
        int tiradaC = 0, tiradaH = 0;


        try {

            System.out.println("Cuantos turnos quieres jugar:");
            turno = Integer.parseInt(sc.nextLine());

        }catch (Exception sx){

            System.out.println("Error");
            return;
        }


        for (int i = 1; i <= turno ; i++) {

            System.out.println("----------------------------------------");


            for (int j = 1; j <= 4 ; j++) {
                tiradaC = numero_aleatorio(1,10);
                System.out.println("Tirada C: " + tiradaC);

                if (tiradaC % 2 != 0) {
                    sumaC += tiradaC;
                }

            }

            System.out.println("La suma de puntos de Cubitos: " + sumaC);


            System.out.println("++++++++++++++++++++++++++++++++++");

            for (int j = 1; j <= 3 ; j++) {
                tiradaH = numero_aleatorio(1,15);
                System.out.println("Tirada H: " + tiradaH);

                if (tiradaH % 2 == 0 ){
                    sumaH += tiradaH;
                }

            }

            System.out.println("La suma de puntos de Humeros: " + sumaH);

            System.out.println("----------------------------------------");

            if (sumaC > sumaH){
                System.out.println("Turno " + i + " Gana Cubitus");
                contadorC++;

            } else if (sumaH > sumaC){
                System.out.println("Turno " + i + " Gana Humerus");
                contadorH++;
            }else {
                System.out.println("Turno " + i + " Empate");
            }

            sumaH = 0;
            sumaC = 0;

        }

        System.out.println("----------------------------------------");

        System.out.println("EL contador de Cunitos: " + contadorC);
        System.out.println("EL contador de Humerus: " + contadorH);

        System.out.println("----------------------------------------");

        if (contadorC > contadorH){
            System.out.println("Gana Cubitus ");

        } else if (contadorH > contadorC){
            System.out.println("Gana Humerus ");
        }else {
            System.out.println("Empate");
        }


        sc.close();

    }

}
