package Tema2.EstructurasBasicasDeControl.EjerciciosControlExcepciones;

import java.util.Scanner;

public class Ejercicio23_2 {

/*Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente
(sin años bisiestos).
Hacer primero una función para determinar que la fecha introducida es correcta.*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia , mes , año;

        System.out.println("Intrega el dia:");
        dia = Integer.parseInt(sc.nextLine());

        System.out.println("Intrega el mes:");
        mes = Integer.parseInt(sc.nextLine());

        System.out.println("Intrega el año:");
        año = Integer.parseInt(sc.nextLine());

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0));

        if(mes >= 1 || mes <= 12);

        if (mes == 12 && dia == 31){
            mes = 1;
            dia = 0;
            año++;
        }

        if (dia == 31 || dia == 30 || dia == 28){
            mes++;
            dia = 0;
        }

        switch (mes){

            case 1 ,3, 5,7,8,0,12:
                if ((dia >= 1 || dia <= 31));
                dia++;
                break;
            case 2:
                if (dia >= 1 || dia <= 28);
                dia++;
                break;
            case 4,6,9,11:
                if (dia >= 1 || dia <= 30);
                dia++;
                break;

        }



        System.out.println("-------------------------------");
        System.out.println(dia + "/" + mes + "/" + año);








    }
}
