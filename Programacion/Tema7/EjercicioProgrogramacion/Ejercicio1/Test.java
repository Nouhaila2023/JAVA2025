package Tema7.EjercicioProgrogramacion.Ejercicio1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Entrega La palabra:");
        Scanner sc = new Scanner(System.in);
        String palabraBus = sc.nextLine();


        Diccionario d = new Diccionario();

        /**
         * Añadir 50 palabra
         */

        Entrada e1 = new Entrada("Hola", "Hello");
        Entrada e2 = new Entrada("Manzana", "Appel");
        Entrada e3 = new Entrada("Libro", "Book");

        d.addEntrada(e1);
        d.addEntrada(e2);
        d.addEntrada(e3);



        System.out.println( d.buscarEntradas(palabraBus));

        sc.close();

    }
}
