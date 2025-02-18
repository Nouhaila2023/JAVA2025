package Tema5.Practica2.Ejercicio1;
import Tema4.Practica1.BladeOfDarkess.Arma;
import Tema5.Practica2.Ejercicio1.enums.TipoMonstruo;

import java.util.ArrayList;
import java.util.List;

public class Partida {

   //Atributos
    private Jugador jugador;
    private List<Monstruo> monstruos;

    //Constructor
    public Partida(Jugador j1) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
        //Agregar 8 al normal
        for (int i = 0; i < 8; i++) {
          monstruos.add(new Monstruo("monst", 13,TipoMonstruo.Demonio));
        }
        //Agregar 2 al monstruos final
        for (int i = 0; i < 2; i++) {
            monstruos.add(new MonstruoFinalNivel("MonstFN",24, TipoMonstruo.Fantasma));
        }
        this.iniciarPartida();
    }

    /**
     * iniciarPartida(): se llamará en el constructor.
     * Le añadirá en un for 100 objetos Monstruos iguales.
     * Equipará al Jugador con las armas que decidas
     * @return
     */

    public void iniciarPartida() {
        this.jugador.equipar(new Arma("Espada", 35,true, Arma.tipo.Espada));
        for (int i = 0; i < 100; i++) {
            this.monstruos.add(new Monstruo("Monstuo", 56,TipoMonstruo.Fantasma ));
        }

    }

    /**
     * turnoJugador(): recorrerá el ArrayList de Monstruos, y el primero que
     * encuentre le golpeará con sus armas. Si el enemigo tiene 0 o menos de vida
     * se quitará del ArrayList de la partida. Si no quedan enemigos vivos en el
     * ArrayList, el jugador gana la partida, y termina (return).
     * @return
     */
      public void turnoJugador(){
          for (Monstruo monstruo : monstruos) {
              this.jugador.golpear(monstruo);
              if (monstruo.getSalud()<=0){
                  this.monstruos.remove(monstruo);
                  System.out.println("Ha ganado el monstruo " + monstruo.getNombre());
              } else if (monstruos.isEmpty()) {
                  System.out.println("El jugador gana la partida " + jugador.getNombre());
                  return;
              }
          }
      }

    /**
     * turnoEnemigos(): el primer Monstruo vivo que haya en el ArrayList, golpea
     * al jugador. Si el Jugador se queda sin vida, pierde la partida y el juego acaba
     * (return).
     * @return
     */
     public void turnoEnemigos(){
         for (Monstruo monstruo : monstruos) {
             monstruo.golpear(jugador);
             System.out.println("Ha ganado el monstruo " + monstruo.getNombre());
             if (jugador.getSalud()<=0){
                 System.out.println("El jugador pierde la partida " + monstruo.getNombre() );
                 return;
             }
             break;
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

}
