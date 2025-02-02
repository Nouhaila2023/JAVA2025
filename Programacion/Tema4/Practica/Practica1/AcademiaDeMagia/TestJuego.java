package Tema4.Practica.Practica1.AcademiaDeMagia;

import Tema4.Practica1.AcademiaDeMagia.Hechizo;
import Tema4.Practica1.AcademiaDeMagia.Mago;
import Tema4.Practica1.AcademiaDeMagia.Prueba;

public class TestJuego {
    public static void main(String[] args) {
        //Crear un mago con energia 100
        Mago mago1 = new Mago("Mago1" , 100);

        //Crear tres Hechizo
        Hechizo bolaDeFuego = new Hechizo("bola de fuego", 20, 7);
        Hechizo escudoMágico = new Hechizo("escudo mágico", 15, 5);
        Hechizo rayoEléctrico = new Hechizo("rayo eléctrico", 25, 9);

        mago1.aprenderHechizo(bolaDeFuego);
        mago1.aprenderHechizo(escudoMágico);
        mago1.aprenderHechizo(rayoEléctrico);

        //crear tres Pruebas
        Prueba romperMuro = new Prueba("romper muro", 5, 10);
        Prueba derrotarOrco = new Prueba("derrotar orco", 8, 15);
        Prueba derrotarElfoOscuro = new Prueba("derrotar elfo oscuro", 10, 20);

        // Prueba 1. Romper el muro con la bola de fuego
        boolean resultado1 = mago1.lanzarHechizo("bola de fuego", romperMuro);

        if (resultado1) {
            System.out.println("EL mago ha roto el muro con EXITO");
        } else {
            System.out.println("El mago NO HA PODIDO romper el muro");
        }
        System.out.println("Energía despues de romper el muro -> " + mago1.getEnergia() + "\n");
// Prueba 2. Derrotar orco con Rayo eléctrico
        boolean resultado2 = mago1.lanzarHechizo("rayo eléctrico", derrotarOrco);

        if (resultado2) {
            System.out.println("El mago a derrotado al orco con EXITO");
        } else {
            System.out.println("El mago NO HA PODIDO derrotar al orco");
        }
        System.out.println("Energia despues de romper el muro -> " + mago1.getEnergia() + "\n");
// Prueba 3. Derrotar al elfo oscuro con el escudo mágico
        boolean resultado3 = mago1.lanzarHechizo("escudo mágico", derrotarElfoOscuro);

        if (resultado3) {
            System.out.println("El mago a derrotado al elfo oscuro con EXITO");
        } else {
            System.out.println("El mago NO HA PODIDO derrotar al elfo oscuro");
        }
        System.out.println("Energia despues de romper el muro -> " + mago1.getEnergia() + "\n");
    }


}
