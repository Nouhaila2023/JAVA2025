package Tema3.Evaluacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void pintarO(char lab[][]) {
        for(int i=0; i<lab.length; i++) {
            for(int j=0; j<lab[i].length; j++) {
                System.out.print(lab[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elige movimiento");
        System.out.println("---Derecha---");
        System.out.println("---Izquierda---");
        System.out.println("---Abajo---");
        System.out.println("---Arriba---");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char tabla[][] = new char[10][10];
        int posXTesoro, posYTesoro;
        int posX=0, posY=0;

        //Aquí estará la bomba
        posXTesoro = numero_aleatorio(18,1);
        posYTesoro= numero_aleatorio(18,1);

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }

        for (int i = 0; i < 15; i++){

            System.out.println("Pocicion X:");
            posX = sc.nextInt();
            System.out.println("Pocicion Y:");
            posY = sc.nextInt();

            int distansia = Math.abs(posXTesoro - posX) + Math.abs(posYTesoro - posY);

            //
            
            if (distansia == 0){
                System.out.println("Estar mas serca del tesoro");
            } else if (distansia != 0) {
                System.out.println("Estas mas lejos del tesoro");
            }


        }


    }
}
