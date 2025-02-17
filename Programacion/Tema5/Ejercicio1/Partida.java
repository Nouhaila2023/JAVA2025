package Tema5.Ejercicio1;
import Tema4.Practica1.BladeOfDarkess.Arma;

import java.util.ArrayList;
import java.util.List;

public class Partida {

   //Atributos
    private Jugador jugador;
    private List<Monstruo> monstruos;

    //Constructor
    public Partida(Jugador jugador, List<Monstruo> monstruos) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
        //Agregar 8 al normal
        for (int i = 0; i < 8; i++) {
            this.monstruos.add(new Monstruo());
        }
        //Agregar 2 al monstruos final
        for (int i = 0; i < 2; i++) {
            this.monstruos.add(new MonstruoFinalNivel());
        }
    }

    /**
     * iniciarPartida(): se llamará en el constructor.
     * Le añadirá en un for 100 objetos Monstruos iguales.
     * Equipará al Jugador con las armas que decidas
     * @return
     */

    public void iniciarPartida() {
        for (int i = 0; i < 100; i++) {
            this.monstruos.add(new Monstruo());
            jugador.equipar(new Arma());
        }
    }


    //Getter and Setter
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public List<Monstruo> getMonstruos() {
        return monstruos;
    }

    public void setMonstruos(List<Monstruo> monstruos) {
        this.monstruos = monstruos;
    }
}
