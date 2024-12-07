package Tema2.Prueva;

import java.util.Scanner;

public class EjercicioPractico {


    public static void main(String[] args) {


        int dia , mes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el dia:");
        dia = sc.nextInt();
        System.out.println("Intrega el mes:");
        mes = sc.nextInt();

        if ((dia > 22 && mes == 12 && mes >=31) || mes < 3 || (mes == 3 && dia <= 19) ){
            System.out.println("Invierno");
        } else if ((dia > 20 && mes == 3 && mes >=31) || mes < 6 || (mes == 6 && dia <= 19)){
            System.out.println("Primavera");
        } else if ((dia > 20 && mes == 6 && mes >=31) || mes < 9 || (mes == 9 && dia <= 21)){
        System.out.println("Verano");
        }else {
            System.out.println("Otono");
        }



    }


}
