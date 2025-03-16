package Tema6.monopoly.entidades;

import java.util.ArrayList;

public class Juego {

    /**
     * Atributos:
     */
    private Tablero tablero;
    private ArrayList<Casilla> casillas;
    private Jugador j1;
    private Jugador j2;

    /**
     * Construdctor
     */
    public Juego(Tablero tablero) {
        this.tablero = tablero;
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

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public Jugador getJ1() {
        return j1;
    }

    public Juego setJ1(Jugador j1) {
        this.j1 = j1;
        return this;
    }

    public Jugador getJ2() {
        return j2;
    }

    public Juego setJ2(Jugador j2) {
        this.j2 = j2;
        return this;
    }

    /**
     * Metodos para iniciar el juego
     */

    public void iniciarjuego() {

        for (int i = 1; i <= 15 ; i++) {
         Casilla c = new Casilla("casilleta",i);
         casillas.add(c);

        }
        j1 = new Jugador("Noha",casillas.getFirst());
        j2 = new Jugador("Faty",casillas.getFirst());


    }
    public void mover(Propiedad p){
        if (!p.getComprada()){
            //j1.getCantidadDinero() += p.getPrecioPagar();
        }
    }
    /**
     * metodo para generar numero aleatorio
     * @param min
     * @param max
     * @return
     */
    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    /*public void avansarJugador(){
        int dado = numero_aleatorio(1,10);
        j1.setToken(dado);
    }*/

}
