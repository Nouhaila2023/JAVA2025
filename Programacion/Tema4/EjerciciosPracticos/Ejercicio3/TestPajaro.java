package Tema4.EjerciciosPracticos.Ejercicio3;

public class TestPajaro {
    public static void main(String[] args) {

        Pajaro pajaro1 = new Pajaro();
        pajaro1.setColor("Rojo");
        pajaro1.setEdad(-10);

        System.out.println(pajaro1);

        Pajaro pajaro2 = new Pajaro();
        pajaro2.setColor("Negro");
        pajaro2.setEdad(10);
        System.out.println(pajaro2);
    }
}
