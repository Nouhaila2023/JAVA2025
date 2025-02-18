package Tema5.Practica2.Ejercicio1;

import Tema5.Practica2.Ejercicio1.enums.TipoJugador;

public class TestJuego {
    /**
     * Crea un main, en él un objeto Partida, inicia la partida, y luego simula unos 30
     * turnos (for) alternativos de jugador y enemigo. Por último, muestra el resultado de quien
     * gana, y cuántos enemigos destruye en total el jugador. Decide tú los valores de salud de
     * cada uno, los puntos y daños del arma, de manera que esté ajustado el juego y el jugador
     * pueda matar al menos 8 monstruos.
     * @param args
     */
    public static void main(String[] args) {

        Jugador j1 = new Jugador("j1", 12, TipoJugador.Barbaro );
        Partida p1 = new Partida(j1);
        int contador = 0;//matar al menos 8
        int turno = 30;

        for (int i = 0; i < turno; i++) {
            System.out.println("Turno " + (i+1));
            System.out.println("Partida para el jugador ");
            p1.turnoJugador();
            System.out.println("Partida para el enemigo ");
            p1.turnoEnemigos();
            System.out.println(p1);


        }




    }
}
