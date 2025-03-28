package Tema7.corsoGenericosColecciones.genericos.practica.ejercicio1;

public class App {
    public static void main(String[] args) {

        Par<Integer, String> par1 = new Par<>(22,"Hola");
        System.out.println(par1);

        Par<String , Double> par2 = Par.of("Hola", 23.0);
        System.out.println(par2);

    }
}
