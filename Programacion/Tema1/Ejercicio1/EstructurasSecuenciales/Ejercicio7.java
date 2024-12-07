package Tema1.Ejercicio1.EstructurasSecuenciales;

//Ejercicio 7
//Una tienda ofrece un descuento del 15% sobre
// el total de la compra y un cliente desea saber
//cuánto deberá pagar finalmente por su compra.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        double descuento = 100 - 15;
        double precio;
        double precioFinal;


        Scanner sc = new Scanner(System.in);

        System.out.println("El precio es: ");
        precio = sc.nextDouble();

        precioFinal = precio * (descuento/100);

        System.out.println("El precio final es: " + precioFinal);



    }
}
