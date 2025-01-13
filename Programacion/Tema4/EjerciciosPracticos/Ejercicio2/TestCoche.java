package Tema4.EjerciciosPracticos.Ejercicio2;

public class TestCoche {
    public static void main(String[] args) {

        Coche coche = new Coche();

        System.out.println("Velocidad de arrancar el coche es:" + coche.getVelocidad());

        coche.acelera(30);
        System.out.println("Velocidad de acelerar el coche es:" + coche.getVelocidad());

        coche.frena(10);
        System.out.println("Velocidad de frenar el coche es:" + coche.getVelocidad());


    }
}
