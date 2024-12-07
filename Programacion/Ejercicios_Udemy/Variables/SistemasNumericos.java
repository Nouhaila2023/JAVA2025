package Ejercicios_Udemy.Variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        //numero decimal
        int num1 = 500;
        System.out.println("num1: " + num1);

        System.out.println("num1_1: " + num1 + " = " + Integer.toBinaryString(num1));

        //numero binario
        int num2 = 0b111110100;
        System.out.println("num2: " + num2 );
        System.out.println("num2_1: " + num2 + " = " + Integer.toOctalString(num2));


        //numero Octal
        int num3 = 0764; //Octal integer
        System.out.println("num3: " + num3);
        System.out.println("num3_1: " + num1 + " = " + Integer.toHexString(num1));

        //numero Hex
        int num4 = 0x1f4;
        System.out.println("num4: " + num4);


        ////////////////

        int num5 = Integer.parseInt(JOptionPane.showInputDialog(null , "Ingrese un munero Intero: "));

        System.out.println(num5);

        String input = JOptionPane.showInputDialog(null, "Qual es tu nombre");

        System.out.println(input);


        ///////////////////////////

        String mensaje = "num1_1: " + num1 + " = " + Integer.toBinaryString(num1);
        mensaje += "\nnum2_1: " + num2 + " = " + Integer.toOctalString(num2);
        mensaje += "\nnum3_1: " + num3 + " = " + Integer.toHexString(num3);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
