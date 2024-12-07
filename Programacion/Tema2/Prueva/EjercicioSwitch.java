package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {

        int dado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dima el numero de la cara del dado:");
        dado = sc.nextInt();

        switch (dado){
            case 1 : System.out.println("sies"); break;
            case 2 : System.out.println("cinco"); break;
            case 3 : System.out.println("cuatro"); break;
            case 4 : System.out.println("tres"); break;
            case 5 : System.out.println("dos"); break;
            case 6 : System.out.println("uno"); break;
            default:
                System.out.println("Error");

        }


    }
}
