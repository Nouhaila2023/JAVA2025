package Tema6.alquilarPelículas.add;

import Tema6.alquilarPelículas.entidades.*;
import Tema6.alquilarPelículas.entidades.enum_.Genero;
import Tema6.alquilarPelículas.entidades1.Serie;

public class Test {

    /**
     * En una clase Test calcula las ganancias anuales de la empresa si tiene 200 pelis (30 son plus a 10€ cada una) y
     * 1.000.000 de clientes (25% son pro). Simula que cada cliente vea las 40 primeras películas y dime las ganancias.
     * @param args
     */
    public static void main(String[] args) {

        PrimeVideo p = new PrimeVideo();

        /**
         * 200 - 30 = 70
         * 70 pelis no son plus
         * 30 pelis son plus (precio 10)
         */

        for (int i = 0; i < 30; i++) {
            p.addCatalogo(new Multimedia(1L, "Tres Metros", 10, true, Genero.COMEDIA));
        }
        for (int i = 0; i < 70; i++) {
            p.addCatalogo(new Multimedia(1L, "El viage", 12, false, Genero.COMEDIA));
        }


        /**
         *  1.000.000 --> 100%
         *      X     --> 25%
         * 1.000.000 de clientes (25% son pro). Simula que cada cliente vea las 40 primeras películas y dime las ganancias.
         */


        //Clientes por
        for (int i = 0; i <25 ; i++) {
            p.addSuscriptor(new ClientePrimePro("Y1234567", "Jose", "jose@gmail.com"));
        }

        for (int i = 0; i < 75; i++) {
            p.addSuscriptor(new ClientePrime("A1234567", "Ana", "ana@gmail.com"));
        }

        /**
         * Simula que cada cliente vea las 40 primeras películas y dime las ganancias.
         */

        for (int i = 0; i < 40; i++) {

        }

        /**
         * Añader 10 series al catalogo.
         * Simula que cada cliente vea 5 series
         * calcuña ñas ganancias
         */

        Serie serie = new Serie(1L, "", 10, true ,Genero.COMEDIA);

        for (int i = 0; i < 10; i++) {
            p.addCatalogo(serie);


        }





    }
}
