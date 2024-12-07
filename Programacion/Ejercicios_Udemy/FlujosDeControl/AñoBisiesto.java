package Ejercicios_Udemy.FlujosDeControl;

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes;
        int año;
        int numeroDias = 0;
        System.out.println("Dime el mes");
        mes = Integer.parseInt(sc.nextLine());
        System.out.println("Mes: " + mes );

        System.out.println("Dime el año");
        año = Integer.parseInt(sc.nextLine());
        System.out.println("Año: " + año);

        if(mes == 1 ||mes == 3 || mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes == 12){
            numeroDias = 31;
        } else if (mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (año % 400 == 0 || (año % 4 == 0) && !(año % 100 == 0)){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
        }

        System.out.println("Numero de dias: " + numeroDias);


    }
}
