package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioPracticoClase {
    public static void main(String[] args) {

        int dia;
        int mes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el mes: ");
        mes = sc.nextInt();
        System.out.println("Intrega el dia: ");
        dia = sc.nextInt();

        switch (mes){
            case 1 ,3 ,5 ,7 ,8 ,10,12:
                if (dia >= 1 && dia <= 31){
                System.out.println("Fecha corecta");
                }else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 4, 6, 9, 11:
                if (dia >= 1 && dia <= 30){
                System.out.println("Fecha corecta");
                }else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 29){
                System.out.println("Fecha corecta");
                }else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            default:
                System.out.println("Mes incorrecta");
        }

    }
}
