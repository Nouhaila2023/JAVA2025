package Tema4.EjercicioPropuestos.Coche;

public class TestCoche {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setMarca("BMW");
        coche.setModelo("BMW");
        coche.setColor("negro");
        coche.setAlto(4);
        coche.setAncho(2.4);
        coche.setLargo(3);

        System.out.println(coche);

    }
}
