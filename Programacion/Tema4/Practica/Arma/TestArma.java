package Tema4.Practica.Arma;

import Tema4.Practica.Personaje.Percsonaje;

/**
 *  2. Crear una clase TestArma, creando una espada y un martillo
 *  *    Crear un personaje como en el ejercicio anterior
 *  *    Golpear con la espada a ese personaje
 *  *    Pintar la espada, el martillo y el personaje
 */
public class TestArma {

    public static void main(String[] args) {

        Arma a1 = new Arma("fuego" , Arma.TipoArma.HACHA , 4);
        Arma a2 = new Arma("agua", Arma.TipoArma.MARTILLO , 3);
        Percsonaje p2 = new Percsonaje("ali" , "elfo" , "hombre" , 19);
        System.out.println(a1);
        a1.golpear(p2);


        System.out.println(a1);
        System.out.println(a2);





    }

}
