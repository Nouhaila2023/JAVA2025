package Tema5.EjercicioPOO.Ejercicio1;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese dni: ");
        String dni = sc.nextLine();
        System.out.println("Ingrese sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese peso: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese altura: ");
        double altura = sc.nextDouble();

        //Crear la premer persona
        Persona persona1 = new Persona(nombre , edad, dni, peso, altura,sexo);

        //Meramos si la persona es mayor edad
        System.out.println(persona1.esMayorEdad() ? "La persona es mayor de edad." : "La persona no es mayor de edad.");

        //Esta en peso o no
        int imc = (int) persona1.calcularIMC();
        if (imc == 1) {
            System.out.println("La persona está en su peso ideal.");
        } else if (imc == 0) {
            System.out.println("La persona tiene bajo peso.");
        } else {
            System.out.println("La persona tiene sobrepeso.");
        }

        System.out.println("\n" + persona1);

        //Crear la segunda persona
        Persona persona2 = new Persona("Nouhila", 22, "Y8106237Q", 44, 1.62, 'M' );

        //comparar si son iquales
        System.out.println("\n" + persona2.equals(persona1));


    }
}
