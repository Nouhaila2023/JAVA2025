package Tema2.Prueva;

import java.util.Scanner;

public class EjemploIf3 {
    public static void main(String[] args) {
        
        //vida , magia , escudEspecial (boolean)
        //si la vida de porconaje menor que 50 y no tiene escuda pinta toma Pocion
        //si no si magia es menor que 50 y no tiene escuda toma opcion Magia
        //si no si vida es menor que 50 y magia es menor qui 50 pinta tomate algo y corre


        int vida;
        int mana;
        boolean escudEspecial = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega la vida: ");
        vida = sc.nextInt();
        System.out.println("Intrega el mana: ");
        mana = sc.nextInt();
        
        if(vida < 50 && escudEspecial == false){
            System.out.println("Toma Opcion");
        } else if (mana <50 && escudEspecial == false) {
            System.out.println("Tom Opcion Magia");
        } else if (vida < 50 && mana < 50) {
            System.out.println("Toma algp y Corre");
        }
        
    }
}
