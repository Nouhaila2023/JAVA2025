package Ejercicios_Udemy.Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //variable = condicion ? si es verdadero : si no es verdadero;

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;


        //Otra forma con el if

        if (promedio >= 5.49) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Rechazado");
        }


        double matematicas = 0.0 , ciencia = 0.0 , historia = 0.0;

        System.out.println("Ingresa la nota de matematicas:");
        matematicas = Double.parseDouble(sc.nextLine());

        System.out.println("intrega la nota de ciencia:");
        ciencia = Double.parseDouble(sc.nextLine());

        System.out.println("intrega la nota de historia:");
        historia = Double.parseDouble(sc.nextLine());

        promedio = (matematicas + ciencia + historia)/3;

        estado = promedio >= 5.0 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);


    }
}
