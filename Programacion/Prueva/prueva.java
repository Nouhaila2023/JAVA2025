package Prueva;

import java.util.Scanner;

public class prueva {
    public static void main(String[] args) {

        int radio = 0;
        double area = 0;
        double perimetro = 0;

        System.out.println("¿El radio? " );

        Scanner sc = new Scanner(System.in);
        radio = sc.nextInt();

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;


        System.out.println("El srea es: " + area);
        System.out.println("El perimetro es: " + perimetro);

    }
}
