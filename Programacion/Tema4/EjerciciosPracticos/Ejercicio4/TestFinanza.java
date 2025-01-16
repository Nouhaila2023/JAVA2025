package Tema4.EjerciciosPracticos.Ejercicio4;

import java.util.Scanner;

public class TestFinanza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cantidad;
        System.out.println("Que es la cantidad:");
        cantidad = sc.nextDouble();

        Finanza finanza = new Finanza();

        System.out.println("El cambio de dolares a erus es: " + finanza.dolaresToEuros(cantidad));
        System.out.println("El cambio de euros a dolares es: " + finanza.eurosToDolares(cantidad));



    }

}
