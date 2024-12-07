package Ejercicios_Udemy.Operadores;

public class OperadorInstasOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

        Object num = 7;

        double decimal = 45.34;

        boolean b1 = texto instanceof String; //no si puede ponerla con Integer o ....

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object; //Object = Es la clase padre  de todos los objetos (int String boolean ...)
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number; // Numbre =  Es la clase padre (abrimis la clase padre con clec derecho y contro)
        System.out.println("num es del tipo Numbre = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es s¡del tip Long = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Numbre = " + b1);





    }
}
