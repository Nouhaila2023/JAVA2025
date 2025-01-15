package Tema4.Practica.EjerciciosPOO.Ejercicio1;

public class Test {
    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura();
        double F = temperatura.celsiusFarenheit(25);
        double C = temperatura.farenheitCelsius(77);

        System.out.println( "Celsius: " + C );
        System.out.println( "Farenheit: " + F );



    }
}
