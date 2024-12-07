package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

    /*Realiza un programa que pida 3 notas y calcule su media. El programa ha
    de indicar la nota en formato boletín (insuficiente, suficiente, bien,
    notable o sobresaliente)*/

        Scanner sc = new Scanner(System.in);

        int nota1 , nota2 ,nota3;

        System.out.println("Introduzca el primer nota: ");
        nota1 = sc.nextInt();
        System.out.println("Introduzca el segundo nota: ");
        nota2 = sc.nextInt();
        System.out.println("Introduzca el terci nota: ");
        nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 1 && media <= 10) {
            if (media <5){
                System.out.println("sobresaliente");
            } else if (media == 5) {
                System.out.println("notable");
            } else if (media >= 8) {
                System.out.println("bien");
            } else if (media >= 9) {
                System.out.println("suficiente");
            }else {
                System.out.println("insuficiente");
            }
        }else {
            System.out.println("La media entre 1 y 10");
        }


    }
}
