package Tema3.EstructurasSelección;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*Escribe un programa que nos diga el horóscopo a partir del día (número)
        y el mes de nacimiento (String). Por ejemplo: Dime tu mes de nacimiento:
        enero  hay que trabajar en el programa con la cadena “enero*/

        Scanner sc = new Scanner(System.in);

        int dia;
        String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                "Septiembre","Noviembre","Diciembre"};

        String mesUsuario;

        System.out.println("Dime tu dia de nacimiento:");
        dia = Integer.parseInt(sc.nextLine());
        System.out.println("Dime tu mes de nacimiento:");
        mesUsuario = sc.nextLine();


        if ((mes[0].equalsIgnoreCase(mesUsuario) && dia >= 20) || (mes[1].equalsIgnoreCase(mesUsuario) && dia <= 18)) {
            System.out.println("Acuario");
        } else if ((mes[1].equalsIgnoreCase(mesUsuario) && dia >= 19) || (mes[2].equalsIgnoreCase(mesUsuario) && dia <= 20)) {
            System.out.println("Piscis");
        } else if ((mes[2].equalsIgnoreCase(mesUsuario) && dia >= 21) || (mes[3].equalsIgnoreCase(mesUsuario) && dia <= 19)) {
            System.out.println("Aries");
        } else if ((mes[3].equalsIgnoreCase(mesUsuario) && dia >= 20) || (mes[4].equalsIgnoreCase(mesUsuario) && dia <= 20)) {
            System.out.println("Tauro");
        } else if ((mes[4].equalsIgnoreCase(mesUsuario) && dia >= 21) || (mes[5].equalsIgnoreCase(mesUsuario) && dia <= 20)) {
            System.out.println("Géminis");
        } else if ((mes[5].equalsIgnoreCase(mesUsuario) && dia >= 21) || (mes[6].equalsIgnoreCase(mesUsuario) && dia <= 22)) {
            System.out.println("Cáncer");
        } else if ((mes[6].equalsIgnoreCase(mesUsuario) && dia >= 23) || (mes[7].equalsIgnoreCase(mesUsuario) && dia <= 22)) {
            System.out.println("Leo");
        } else if ((mes[7].equalsIgnoreCase(mesUsuario) && dia >= 23) || (mes[8].equalsIgnoreCase(mesUsuario) && dia <= 22)) {
            System.out.println("Virgo");
        } else if ((mes[8].equalsIgnoreCase(mesUsuario) && dia >= 23) || (mes[9].equalsIgnoreCase(mesUsuario) && dia <= 22)) {
            System.out.println("Libra");
        } else if ((mes[9].equalsIgnoreCase(mesUsuario) && dia >= 23) || (mes[10].equalsIgnoreCase(mesUsuario) && dia <= 21)) {
            System.out.println("Escorpio");
        } else if ((mes[10].equalsIgnoreCase(mesUsuario) && dia >= 22) || (mes[11].equalsIgnoreCase(mesUsuario) && dia <= 21)) {
            System.out.println("Sagitario");
        } else if ((mes[11].equalsIgnoreCase(mesUsuario) && dia >= 22) || (mes[0].equalsIgnoreCase(mesUsuario) && dia <= 19)) {
            System.out.println("Capricornio");
        } else {
            System.out.println("Fecha no válida");
        }


    }
}
