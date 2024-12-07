package Prueva;

import java.util.Scanner;

public class ProdoctoIVA {
    public static void main(String[] args) {

        double producto1;
        double IVA1 = 0.2; //IVA 20%
        double productoConIva1 = 0;

        System.out.println("Le precio del producto1: ");

        Scanner sc = new Scanner(System.in);
        producto1 = sc.nextDouble();

        productoConIva1 = producto1 * (1 + IVA1);

        System.out.println("Le precio del producto1 con el IVA");
        System.out.println(productoConIva1 + "€");

        // otra manera

        double producto2;
        double IVA2 = 0.2; //IVA 20%
        double productoConIva2 = 0;

        System.out.println("Le precio del producto2: ");

        producto2 = sc.nextDouble();

        productoConIva2 = producto2 + (producto2 * IVA2);

        System.out.println("Le precio del producto2 con el IVA");
        System.out.println(productoConIva2 + "€");





    }
}
