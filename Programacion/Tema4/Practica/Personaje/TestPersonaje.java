package Tema4.Practica.Personaje;

import Tema4.Practica.Arma.Arma;

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


        Arma a1 = new Arma("fuego", Arma.TipoArma.HACHA, 4);
        Arma a2 = new Arma("agua", Arma.TipoArma.MARTILLO, 3);


        Personaje p1 = new Personaje("Ali", "Elfo", "Hombre", 19, a1);
        Personaje p2 = new Personaje("Erano", "Enano", "Hombre", 100, a2);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("-------------------------------------------------------");

        p1.setNombre("Erano");
        p2.setVida(75);

        System.out.println(p1);
        System.out.println(p2);



    }
}
