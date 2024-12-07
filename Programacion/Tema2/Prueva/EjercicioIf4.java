package Tema2.Prueva;
import java.util.Scanner;

public class EjercicioIf4 {
    public static void main(String[] args) {

        //edad:
        /**
         * 1 al 11 ---- Hola niño
         * 12 al 18 ----  Hola chaval
         * 18 al 29 ---- hola tio
         * 30 al 60 ---- hola Hombre
         * >60 ---- hola abuelo
         **/

        int edad;


        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el edad:");
        edad = sc.nextInt();


        if (edad >= 1 && edad <= 11 ){
            System.out.println("Hola Niño");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Hola Chaval");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Hola Tio");
        } else if (edad >= 30 && edad <= 60) {
            System.out.println("Hola Hombre");
        } else if (edad >= 61) {
            System.out.println("Hola Abuelo");
        }

//***************Pedimos el sexo y el edad************************************//

        char sexo ;
        System.out.println("Intrega el sexo con H, M, O ");
        sexo = sc.next().charAt(0);
        System.out.println("Intrega el edad:");
        edad = sc.nextInt();

        if (sexo == 'H'){
            if (edad >= 1 && edad <= 11 ){
                System.out.println("Hola Niño");
            } else if (edad >= 12 && edad <= 18) {
                System.out.println("Hola Chaval");
            } else if (edad >= 18 && edad <= 29) {
                System.out.println("Hola Tio");
            } else if (edad >= 30 && edad <= 60) {
                System.out.println("Hola Hombre");
            } else if (edad >= 61) {
                System.out.println("Hola Abuelo");
            }
        }

        if (sexo == 'M'){
            if (edad >= 1 && edad <= 11 ){
                System.out.println("Hola Niña");
            } else if (edad >= 12 && edad <= 18) {
                System.out.println("Hola Chavala");
            } else if (edad >= 18 && edad <= 29) {
                System.out.println("Hola Tia");
            } else if (edad >= 30 && edad <= 60) {
                System.out.println("Hola Mujer");
            } else if (edad >= 61) {
                System.out.println("Hola Abuela");
            }
        }




    }
}
