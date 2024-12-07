package Ejercicios_Udemy.Variables;

public class ConversiDeTipos {

    public static void main(String[] args) {


        String numeroStr1 = "50";
        int numeroInt = Integer.parseInt(numeroStr1);
        System.out.println("numeroInt: " + numeroInt);

        String numroStr2 = "78.9";
        double numroDouble = Double.parseDouble(numroStr2);
        System.out.println("numroDouble: " + numroDouble);

        String numroStr3 = "true";
        boolean numroBool = Boolean.parseBoolean(numroStr3);
        System.out.println("numroBool: " + numroBool);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt: " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otro Numro con el valueOf: " + otroNumeroStr);


        int i = 22768;
        short s = (short) i;
        System.out.println("s: " + s);

        long l = i;
        System.out.println("l: " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b: " + b);
        float f = (float) i;
        System.out.println("f: " + f);




        Object obj = new Object();
        String strObjeto = String.valueOf(obj);  // Llama a obj.toString(), si es null, devuelve "null"
        System.out.println(obj);
        System.out.println(strObjeto);

    }

}
