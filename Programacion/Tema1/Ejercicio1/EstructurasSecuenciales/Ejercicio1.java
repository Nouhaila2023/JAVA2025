package Tema1.Ejercicio1.EstructurasSecuenciales;
import java.util.Scanner;

//Ejercicio 1
//Escribir un programa que pregunte al usuario
// su nombre, y luego lo salude

public class Ejercicio1 {
    public static void main(String[] args) {

    String nombre ;

    System.out.println("Cual es tu nombre: ");

    Scanner sc = new Scanner(System.in);
    nombre = sc.next();

    System.out.println("Hola " + nombre);




    }
}
