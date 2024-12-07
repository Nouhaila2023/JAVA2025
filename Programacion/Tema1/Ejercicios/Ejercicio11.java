package Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        //Realiza un programa que calcule el área y
        // el perímetro de un círculo de radio 3,6 metros

        double area , perimetro , redio = 3.6;

        area = Math.PI * Math.pow(redio,2);
        perimetro = 2 * Math.PI * redio;

        System.out.println("El area es: " + area);
        System.out.println("EL perimetro es: " + perimetro);


    }
}
