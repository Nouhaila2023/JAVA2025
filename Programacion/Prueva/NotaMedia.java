package Prueva;

import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;

        double notamedia;

        Scanner sc = new Scanner(System.in);

        System.out.println("La premir nota: ");
        nota1 = sc.nextDouble();

        System.out.println("La segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("La tercer nota: ");
        nota3 = sc.nextDouble();


        notamedia = (nota1 + nota2 + nota3) / 3;

        System.out.println("La nota media es: " + "(" + nota1 + " + " + nota2 + " + " + nota3 + ")" + "/3" + " = "  + notamedia);

    }
}
