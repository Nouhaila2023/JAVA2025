package Tema3.ClasesStringStringBuffer;

public class Ejercicio10 {

    /**
     * Compara estos dos Strings sin tener en cuenta mayúsculas
     * “Esta tarde no voy”, “esta tarde no VOY”.
     * @param args
     */


    public static void main(String[] args) {

        String cadena1 = "Esta tarde no voy";
        String cadena2 = "esta tarde no VOY";

        /*if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Es igual");
        }else {
            System.out.println("No es igual");
        }*/

        if (cadena1.toLowerCase().equals(cadena2.toLowerCase())) {
            System.out.println("Son iguales");
        }else {
            System.out.println("NO iguales");
        }


    }
}
