package Tema2.EstructurasBasicasDeControl.EjerciciosControlExcepciones;

import java.util.Scanner;

public class Ejercicio23 {

    public static int año(int año){
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0));

        return año;
    }

    public static int mesdia(int mes , int dia){

        if(mes >= 1 || mes <= 12);

        switch (mes){
            case 1 ,3, 5,7,8,0,12:
                if (dia >= 1 || dia <= 31);
                break;
            case 2:
                if (dia >= 1 || dia <= 28);
                break;
            case 4,6,9,11:
                if (dia >= 1 || dia <= 30);
                break;
        }

        return mes;
    }



    public static void main(String[] args) {

        /*Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente
         (sin años bisiestos). Hacer
primero una función para determinar que la fecha introducida es correcta.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Intrega el día");
        int dia = sc.nextInt();

        System.out.println("Intreha el mes");
        int mes = sc.nextInt();

        System.out.println("Intrega el año");
        int año = sc.nextInt();


        int mesdia = mesdia(mes,dia);
        int años = año(año);

        System.out.println(mesdia);
        System.out.println(años);





    }
}
