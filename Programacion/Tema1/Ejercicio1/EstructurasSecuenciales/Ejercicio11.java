package Tema1.Ejercicio1.EstructurasSecuenciales;

public class Ejercicio11 {
    public static void main(String[] args) {


        int num = 23;
        int decena , unidad;
        decena = num / 10;
        unidad = num %10;

        System.out.println(decena);
        System.out.println(unidad);

        int fin = unidad * 10 + decena;
        System.out.println(fin);


    }
}
