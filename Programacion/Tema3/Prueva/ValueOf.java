package Tema3.Prueva;

public class ValueOf {

    public static void main(String[] args) {

        int entero = 23;
        double decimal = 4.4;
        boolean logico = true;

        String strEntero = String.valueOf(entero);
        String strdecimal = String.valueOf(decimal);
        String strlogico = String.valueOf(logico);

        System.out.println(strEntero);
        System.out.println(strdecimal);
        System.out.println(strlogico);

    }

}
