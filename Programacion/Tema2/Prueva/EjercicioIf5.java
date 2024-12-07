package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioIf5 {
    public static void main(String[] args) {

        //Pedir por teclado la hora del dia
        /*
        * 6 a 12 ---- Buenos dias
        * 12 a 20 ---- buenas tardes
        * En otro momento buenas noches
        */
        //Pedir el nivel del jugador
        /*
        * 1---5
        * 1. Iniciado
        * 2. Amateur
        * 3. Profesional
        * 4. Experto
        * 5. Dios
        */


        Scanner sc = new Scanner(System.in);

        int hora;
        int nivel;


        System.out.println("Intrega la hora (24):");
        hora = sc.nextInt();

        System.out.println("Intrega el nivel (1--5):");
        nivel = sc.nextInt();

        if (nivel == 1 ){
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos dias jugador del nevel Iniciado");
            } else if (hora > 12 && hora <= 20){
                System.out.println("Buenas tardes jugador del nevel Iniciado");
            }else {
                System.out.println("buenas noches jugador del nevel Iniciado");
            }
        } else if (nivel == 2 ) {
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos dias jugador del nevel Amateur");
            } else if (hora > 12 && hora <= 20){
                System.out.println("Buenas tardes jugador del nevel Amateur");
            }else {
                System.out.println("buenas noches jugador del nevel Amateur");
            }
        } else if (nivel == 3) {
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos dias jugador del nevel Profesional");
            } else if (hora > 12 && hora <= 20){
                System.out.println("Buenas tardes jugador del nevel Profesional");
            }else {
                System.out.println("buenas noches jugador del nevel Profesional");
            }
        } else if (nivel == 4) {
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos dias jugador del nevel Experto");
            } else if (hora > 12 && hora <= 20){
                System.out.println("Buenas tardes jugador del nevel Experto");
            }else {
                System.out.println("buenas noches jugador del nevel Experto");
            }
        } else if (nivel == 5) {
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos dias jugador del nevel Dios");
            } else if (hora > 12 && hora <= 20){
                System.out.println("Buenas tardes jugador del nevel Dios");
            }else {
                System.out.println("buenas noches jugador del nevel Dios");
            }
        }


    }
}
