package Tema1.Ejercicio1.EstructurasSecuenciales;
import java.util.Scanner;

//Ejercicio 4
//Escribir un programa que convierta un valor dado
// en grados Fahrenheit a grados Celsius.
//Recordar que la fórmula para la conversión es:
//C = (F-32)*5/9

public class Ejercicio4 {
    public static void main(String[] args) {

        double gradoFahrenheit;
        double gradoCelsius;

        Scanner sc = new Scanner(System.in);
        System.out.println("El Grado Fahrenheit: ");
        gradoFahrenheit = sc.nextDouble();

        gradoCelsius = (gradoFahrenheit-32)*5/9;

        System.out.println("E grado Fahrenheit es: " + gradoCelsius);

    }
}
