package Prueva;

import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        
        /*Un alumno quiere sabel su nota final de programacion
        * Tres examenes personal: nota1 , nota2 , nota3  (55%)
        * Examen final: nota Examan final  (30%)
        * trabajo final: nota de trabajo final  (15%)
        * */

        //Variables
        double nota1 , nota2 , nota3;
        double mediaNotas;
        double examenClase;
        double examenFinal;
        double trabajoFinal;
        double notaFinal;
        double porcentajeNota = (double) 55/100;
        double porcentajeExamenfinal = (double) 30/100;
        double porcentajeTrajabo = (double) 15/100;


        Scanner sc = new Scanner(System.in);

        //Pedimos las tres notas
        System.out.println("La premer nota: ");
        nota1 = sc.nextDouble();
        System.out.println("La segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("La tercera nota: ");
        nota3 = sc.nextDouble();

        mediaNotas = (nota1 + nota2 + nota3) / 3;
        examenClase = mediaNotas * porcentajeNota;

        //Examen final

        System.out.println("La nota del examen final: ");
        examenFinal = sc.nextDouble();
        examenFinal *= porcentajeExamenfinal;

        //Trabajo final

        System.out.println("La nota del trabajo final: ");
        trabajoFinal = sc.nextDouble();
        trabajoFinal *= porcentajeTrajabo;

        //La nota final

        notaFinal = trabajoFinal + examenFinal + examenClase;

        System.out.println("La nota final es: " + String.format("%.2f",notaFinal));

    }
}
