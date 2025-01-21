package Tema4.Practica.EjercicioEqualsCCopia;

public class TrstTelefonoMovil {
    /**
     * . Crea una clase TestTelefonoMovil con un main:
     * - Crea t1 con los valores que tú decidas
     * - Crea t2 usando el constructor copia con t1
     * - Crea t3 usando el = con t1
     * - Imprime los tres objetos
     * - Muestra la comparación de t1, t2 y t3 con equals
     * - Muestra la comparación de t1, t2 y t3 con ==
     * - Observa que t1 y t2 son objetos diferentes y t1 y t3 son el mismo objeto.
     * - ¿Por qué utilizar equals en lugar de == ?
     * usamos el equalas para ver los valores si son iquales o no
     * @param args
     */
    public static void main(String[] args) {


        TelefonoMovil t1 = new TelefonoMovil("S1", 5.5, "+34", "631954471");
        TelefonoMovil t2 = new TelefonoMovil(t1);
        TelefonoMovil t3 = t1;


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        if (t1.equals(t2) && t1.equals(t3)){
            System.out.println("Iguales");
        }else {
            System.out.println("Diferentes");
        }

        if (t1 == t2 && t1 == t3){
            System.out.println("Iguales");
        }else {
            System.out.println("Diferentes");
        }




    }

}
