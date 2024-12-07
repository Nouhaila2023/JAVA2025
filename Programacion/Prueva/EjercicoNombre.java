package Prueva;

import java.util.Scanner;
//Ejercicio de clase
//crea un programa que pida por teclado tu nombre y tus apellidos por separado
//Tienes que mostrar poer pantalla , primero los apellidos luego una como y luego tu nombre


public class EjercicoNombre {
    public static void main(String[] args) {

    String nombre;
    String primerApellido;
    String segundoApellido;

    Scanner sc = new Scanner(System.in);

    System.out.println("Cual es tu nombre: ");
    nombre = sc.nextLine();
    System.out.println("Cual es tu primer apellido: ");
    primerApellido = sc.nextLine();
    System.out.println("Cual es tu segundo apellido: ");
    segundoApellido = sc.nextLine();

    System.out.println("El nombre completo es: " + primerApellido + " " + segundoApellido + ", " + nombre );

    sc.close();

    }

    public static class IVA {
        public static void main(String[] args) {

            double precio1 = 0;
            double iva1 = 0.2;
            double precioconvia1 ;

            System.out.println("El precio: ");

            Scanner sc = new Scanner(System.in);
            precio1 = sc.nextDouble();

            precioconvia1 = precio1 * (1 + iva1);

            System.out.println("El precio1 del preoducto con el IVA es: " + precioconvia1 + "€");


            //Otra manera

            double precio2 = 0;
            double iva2 = 0.2;
            double precioconvia2 ;

            System.out.println("El precio es de: ");

            precio2 = sc.nextDouble();

            precioconvia2 = precio2 + (precio2 * iva1);

            System.out.println("El precio2 del preoducto con el IVA es: " + precioconvia2 + "€");


        }
    }
}
