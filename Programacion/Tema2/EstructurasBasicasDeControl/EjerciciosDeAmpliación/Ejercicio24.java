package Tema2.EstructurasBasicasDeControl.EjerciciosDeAmpliación;

import java.util.Scanner;

public class Ejercicio24 {

    public static boolean esFechaValida(int dia, int mes, int año ){

        boolean fecha = true;

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }

        switch (mes){

            case 1 ,3, 5,7,8,0,12:
                fecha = ((dia >= 1 && dia <= 31));
                break;
            case 2:
                fecha = (dia >= 1 && dia <= 28);
                break;
            case 4,6,9,11:
                fecha = (dia >= 1 && dia <= 30);
                break;
            default:
                fecha = false;
        }


        return  fecha;

    }

    public static void main(String[] args) {
/*Escribe un método, de nombre esFechaValida, que reciba como parámetros tres
valores enteros con el día, mes y año de una fecha y devuelva un valor booleano
que indique si se trata de valores válidos para una fecha.
Si puedes comprueba también que el año sea bisiesto.*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el día:");
        int dia = sc.nextInt();
        System.out.println("Intrega el mes:");
        int mes = sc.nextInt();
        System.out.println("Intrega el año:");
        int año = sc.nextInt();

        if(esFechaValida(dia,mes,año)){
            System.out.println("Fecha valida");
        }else {
            System.out.println("Fecha no valida");
        }




    }
}
