package Tema6.alquilerPeliculas.app;

import Tema6.alquilerPeliculas.entidades.Cliente;
import Tema6.alquilerPeliculas.entidades.Multimedia;
import Tema6.alquilerPeliculas.entidades.Pelicula;
import Tema6.alquilerPeliculas.entidades.PrimeVideo;
import Tema6.alquilerPeliculas.entidades.enum_.Genero;

public class main {
    public static void main(String[] args) {

        /**
         * En una clase Test calcula las ganancias anuales de la empresa si tiene 200 pelis (30 son plus a 10€ cada una) y
         * 1.000.000 de clientes (25% son pro). Simula que cada cliente vea las 40 primeras películas y dime las ganancias.
         */

        PrimeVideo pr = new PrimeVideo();

        //Si es plus
        for (int i = 0; i < 30; i++) {
            pr.addMultimedia(new Pelicula(1l, "Tres metros", 10,true ,Genero.DREMA, 120));
        }

        //Si no es plus
        for (int i = 0; i < 170; i++) {
            pr.addMultimedia(new Pelicula(2L, "La vida", 12, false,Genero.COMEDIA, 120));
        }


        // 1.000.000 de clientes (25% son  pro)

        //Clientes pro
        for (int i = 0; i < 250000; i++) {

        }




    }
}
