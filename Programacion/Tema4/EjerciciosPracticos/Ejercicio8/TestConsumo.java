package Tema4.EjerciciosPracticos.Ejercicio8;

public class TestConsumo {
    public static void main(String[] args) {

        Consumo consumo1 = new Consumo(100, 70, 50,1.43);
        Consumo consumo2 = new Consumo(50, 40, 20,1.43);

        System.out.println(consumo1);
        System.out.println(consumo2);
        System.out.println("------------------------------------------------");
        System.out.println("Tiempo " + consumo1.getTiempo());
        System.out.println("Tiempo " + consumo2.getTiempo());
        System.out.println("Consumo Euros del Consumo1: " + consumo1.consumoEuros());
        System.out.println("Consumo Euros del Consumo1: " + consumo2.consumoEuros());
        System.out.println("Consumo Medio del Consumo1: " + consumo1.consumoMedio());
        System.out.println("Consumo Medio del Consumo1: " + consumo2.consumoMedio());





    }
}
