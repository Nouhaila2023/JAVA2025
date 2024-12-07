package Tema1.Ejercicio1.EstructurasSecuenciales;
//luis Miguel Lopez

//Ejercicio 2
//Calcular el perímetro y área de un
//rectángulo dada su base y su altura

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double base;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("que es el base");
        base = sc.nextDouble();

        System.out.println("que es el altura");
        altura = sc.nextDouble();

        double perimetro;
        double area;

        area = (base * altura) / 2;
        perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);




    }
}
