package Tema5.Ejercicio1;

import Tema4.Practica1.BladeOfDarkess.Jugador;

public class Monstruo extends Personaje {

    private int puntosD; //Puntos de daño que el monstruo al golpear
    enum Tipo {Goblin, Troll, Skall, Demonio, Fantasma};
    private Tipo tipo;

    /// //////////METODOS/////////////////////////

    //Construres

    public Monstruo(String nombre, int nivel, double salud, int puntosD, Tipo tipo) {
        super(nombre, nivel, salud);
        this.puntosD = puntosD;
        this.tipo = tipo;
    }


    /////////Get and Set /////////////////////////
    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    ///////////////toString////////////////////////
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("puntosD=").append(puntosD);
        sb.append(", tipo=").append(tipo);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador
     */

    public void golpear(Jugador jugador){
        jugador.reducirVida(puntosD);
    }













}
