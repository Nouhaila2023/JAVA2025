package Tema1.Ejercicio1.EstructurasAlternativas;
import java.util.Scanner;

/*Ejercicio 8
Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un
dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara
opuesta al resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el
mensaje: “ERROR: número incorrecto.”.
Ejemplo:
Introduzca número del dado: 5
En la cara opuesta está el "dos".*/

public class Ejercicio8 {
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
