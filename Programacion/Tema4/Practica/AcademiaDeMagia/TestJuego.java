package Tema4.Practica.AcademiaDeMagia;

import Tema4.Practica1.AcademiaDeMagia.Hechizo;
import Tema4.Practica1.AcademiaDeMagia.Mago;
import Tema4.Practica1.AcademiaDeMagia.Prueba;

public class TestJuego {
    public static void main(String[] args) {
        //Crear un mago con energia 100
        Mago mago1 = new Mago("Mago1" , 100);

        //Crear tres Hechizo
        Hechizo hechizo1 = new Hechizo("bola de fuego", 20, 7);
        Hechizo hechizo2 = new Hechizo("escudo mágico", 15, 5);
        Hechizo hechizo3 = new Hechizo("rayo eléctrico", 25, 9);

        mago1.aprenderHechizo(hechizo1);
        mago1.aprenderHechizo(hechizo2);
        mago1.aprenderHechizo(hechizo3);

        //crear tres Pruebas
        Prueba prueba1 = new Prueba("romper muro", 5, 10);
        Prueba prueba2 = new Prueba("derrotar orco", 8, 15);
        Prueba prueba3 = new Prueba("derrotar elfo oscuro", 10, 20);

    }


}
