package Tema1.Ejercicio1.EstructurasSecuenciales;

//Pide al usuario dos números y muestra la “distancia” entre
// ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo).

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        double numero1, numero2;
        double distancia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el premer numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Intrega el segundo numero: ");
        numero2 = sc.nextDouble();

        distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia es: " + distancia);





    }
}
