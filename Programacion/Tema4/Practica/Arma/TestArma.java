package Tema4.Practica.Arma;

import Tema4.Practica.Personaje.Personaje;

public class TestArma {

    public static void main(String[] args) {


            Arma espada = new Arma("Espada de fuego", Arma.TipoArma.ESPADA, 25);
            Arma martillo = new Arma("Martillo maldito", Arma.TipoArma.MARTILLO, 40);

            Personaje soldado = new Personaje("Ali", "Elfo", "Hombre", 19, espada);


            System.out.println(soldado);

            espada.golpear(soldado);

            System.out.println(espada);
            System.out.println(martillo);
            System.out.println(soldado);

        }
}
