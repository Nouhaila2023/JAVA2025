package Prueva;

import java.util.Arrays;

public class Variables {

    public static void main(String[] args) {

        //numero enteros

        //entre -128 a 127
        byte num1 = 127;
        System.out.println("num1 = " + num1);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor maxion de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);


        // entre -32768 a 32767
        short num2 = 32767;

        System.out.println("num2 = " + num2);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en byte a " + Short.SIZE);
        System.out.println("valor maxion de un Short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un Short: " + Short.MIN_VALUE);



        //entre -2147483648 a 2147483647
        int num3 = 2147483647;

        System.out.println("num3 = " + num3);
        System.out.println("tipo Integer corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Integer corresponde en byte a " + Integer.SIZE);
        System.out.println("valor maxion de un Integer: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Integer: " + Integer.MIN_VALUE);

        //entre -9223372036854775807 a 9223372036854775807
        long num4 = 9223372036854775807L;

        System.out.println("num4 = " + num4);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en byte a " + Long.SIZE);
        System.out.println("valor maxion de un Long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);


///////////////////////////////////////////////////////////////////////////////////

        //numero reales

        float num5 = 3.1416f;

        double num6 = 4.7029235E3;

//////////////////////////////////////////////////////////////////////////////////


        char c = 'c';
        char d = '1';
        char num7 = '\u0040'; //numero unicode
        char num8 = 64; // ASCII

        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8 );
        System.out.println("num7 = num8: " + (num7 == num8) );


//////////////////////////////////////////////////////////////////////////////////

        boolean a = true;
        boolean b = false;



    }
}
