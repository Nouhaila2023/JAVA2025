package Tema5.Ejercicio1;

import Tema5.Ejercicio1.enums.TipoMonstruo;

public class Monstruo extends Personaje {

    protected int puntosD; //Puntos de daño que el monstruo al golpear
    protected TipoMonstruo tipo;

    /////////////METODOS/////////////////////////

    //Construres


    public Monstruo(String nombre, int puntosD, TipoMonstruo tipo) {
        super(nombre);
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

    public TipoMonstruo getTipo() {
        return tipo;
    }

    public void setTipo(TipoMonstruo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    ///////////////toString////////////////////////


    @Override
    public void subirNivel() {
        super.subirNivel();
    }

    @Override
    public boolean reducirVida(int puntosD) {
        return super.reducirVida(puntosD);
    }

    /**
     * Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador
     */

    public void golpear(Personaje personaje) {
        personaje.reducirVida(puntosD);
    }













}
