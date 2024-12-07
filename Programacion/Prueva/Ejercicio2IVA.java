package Prueva;
//Crea un programa que pede por teclado el precio de un producto.
//Pide tambian la cantidad de ese prodocto que un compra.
//Develve el precio final con con el iva 21%

import java.util.Scanner;

public class Ejercicio2IVA {

    public static void main(String[] args) {

        double precio;
        int cantidad;
        int iva = 21;
        double precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el precio");
        precio = sc.nextDouble();
        System.out.println("Dame la cantidad");
        cantidad = sc.nextInt();

        precioFinal = (precio + (precio*(iva/100))) * cantidad;

        System.out.println("El precio final es: " + precioFinal + "€");

        sc.close();

    }
}
