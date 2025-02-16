package Tema5.Ejercicio1;

public class MonstruoFinalNivel extends Monstruo{

    private int golpe;

    public MonstruoFinalNivel(String nombre, int nivel, double salud, int puntosD, Tipo tipo) {
        super(nombre, nivel, salud, puntosD, tipo);
        this.golpe = golpe;
    }

    public int getDaño() {
        return golpe;
    }
    public void setDaño(int daño) {
        this.golpe = daño;
    }

    //golpeEspecial: serán los puntos de daño de un golpe especial que tiene este
//monstruo.
    public void golpeEspecial(Jugador jugador){

    }







}
