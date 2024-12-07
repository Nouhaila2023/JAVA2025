package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioIf2 {
    public static void main(String[] args) {

        //Personaje que tiene vida y mana
        //si la vida es manor de 50 pinto que tiene que tomar opcion de vida
        //si el mana es menor de 50 pinta que tiene que toma opcion de magia
        //si la vida es menor que 50 y el mana en menor que 50 quie pinte "CORRE"

        int vida;
        int mana;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega la vida: ");
        vida = sc.nextInt();
        System.out.println("Intrega el mana: ");
        mana = sc.nextInt();

        if (vida < 50){
            System.out.println("Toma opcion de vida");
        }
        if (mana < 50){
            System.out.println("Toma opcion de magia");
        }

        if (vida < 50 && mana < 50){
            System.out.println("CORRE");
        }


    }
}
