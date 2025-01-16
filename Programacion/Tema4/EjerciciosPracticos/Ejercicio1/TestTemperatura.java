package Tema4.EjerciciosPracticos.Ejercicio1;

public class TestTemperatura {
    public static void main(String[] args) {

        Temperatura tempetatura = new Temperatura();

        System.out.println(tempetatura.celsiusFarenheit(23));
        System.out.println(tempetatura.farenheitCelsius(23));

        System.out.println("------------------------------");

        double celsius = tempetatura.farenheitCelsius(77);
        double fahrenheit = tempetatura.celsiusFarenheit(25);

        System.out.println("Grados de celsius son: " + celsius + " y grados de fahrenheit son: " + fahrenheit);
    }
}
