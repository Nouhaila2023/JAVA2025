package Tema4.EjerciciosPracticos.Ejercicio1;

public class TestTemperatura {
    public static void main(String[] args) {

        Temperatura tempetatura = new Temperatura();

        double celsius = tempetatura.farenheitCelsius(77);
        double fahrenheit = tempetatura.celsiusFarenheit(25);

        System.out.println("Grados de celsius son: " + celsius + " y grados de fahrenheit son: " + fahrenheit);
    }
}
