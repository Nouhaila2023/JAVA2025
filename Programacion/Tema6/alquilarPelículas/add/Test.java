package Tema6.alquilarPelículas.add;

import Tema6.alquilarPelículas.entidades.Multimedia;
import Tema6.alquilarPelículas.entidades.Peicula;
import Tema6.alquilarPelículas.entidades.PrimeVideo;
import Tema6.alquilarPelículas.entidades.enum_.Genero;

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
         *  X =
         */

    }
}
