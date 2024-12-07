package Tema1.Ejercicio1.EstructurasSecuenciales;

//Ejercicio 6
//Realiza un programa que reciba una cantidad de minutos y
// muestre por pantalla a cuantas
//horas y minutos corresponde.
//Por ejemplo: 1000 minutos son 16 horas y 40 minutos

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int calculadoraMinuto;
        int minuto;
        int resto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Minutos: ");
        minuto = sc.nextInt();

        calculadoraMinuto = minuto/60;
        resto = minuto-(calculadoraMinuto*60);

        //Otra manera para el menotos
        int resta1 = calculadoraMinuto % 60;

        System.out.println(calculadoraMinuto + "h " + resto + "min");

        System.out.println(resta1);

    }
}
