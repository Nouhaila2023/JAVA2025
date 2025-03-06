package Tema6.monopoly.entidades;

import java.util.ArrayList;

public class Juego {

    /**
     * Atributos:
     */
    private Tablero tablero;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Casilla> casillas;

    /**
     * Construdctor
     */
    public Juego(Tablero tablero) {
        this.tablero = tablero;
        this.jugadores = new ArrayList<>();
        this.casillas = new ArrayList<>();
    }

    /**
     * Getter y setter
     */
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    /**
     * Metodos para iniciar el juego
     */

    public void iniciarjuego() {

        for (int i = 1; i <= 15 ; i++) {
         Casilla c = new Casilla("casilleta",i);
         casillas.add(c);

        }
        Jugador jugador1 = new Jugador("Noha",casillas.getFirst(),100.0);
        Jugador jugador2 = new Jugador("Faty",casillas.getFirst(),100.0);
        this.jugadores.add(jugador1);
        this.jugadores.add(jugador2);

    }

}
