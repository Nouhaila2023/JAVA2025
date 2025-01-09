package Tema4.Practica.Personaje;

public class TestPersonaje {

    /**
     * 2. Crear una clase TestPersonaje
     *    - Crear un objeto jugador1 con los valores que queráis.
     *    - Crear un objeto jugador2 con los valores por defecto.
     *    - Cambiar la clase de jugador1 a "Enano"
     *    - Cambiar la vida de jugador2 a 75
     *    - Pintar jugador1 y jugador2
     */


    public static void main(String[] args) {

        Percsonaje p1 = new Percsonaje("nouhaila" , "elfo" , "mujer" , 10);
        Percsonaje p2 = new Percsonaje("ali" , "elfo" , "hombre" , 19);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("-------------------------------------------------------");

        p1.setNombre("Erano");
        p2.setVida(75);

        System.out.println(p1);
        System.out.println(p2);



    }
}
