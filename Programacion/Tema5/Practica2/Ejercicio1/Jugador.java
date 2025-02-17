package Tema5.Practica2.Ejercicio1;
import Tema4.Practica1.BladeOfDarkess.Arma;
import Tema5.Practica2.Ejercicio1.enums.TipoJugador;

public class Jugador extends Personaje {

    /////////// PROPIEDADES ///////////////////////
    private int experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;
    private TipoJugador tipoJugador;

    ///////////////Constructor///////////////
    public Jugador(String nombre, int experiencia,
            TipoJugador tipoJugador) {
        super(nombre);
        this.experiencia = experiencia;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
        this.tipoJugador = tipoJugador;
    }

    ///////////Get and Set ///////////////////////
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    public TipoJugador getTipo() {
        return tipoJugador;
    }

    public void setTipo(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    /// ///////////toString//////////////////////
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append(", tipo=").append(tipoJugador);
        sb.append('}');
        return sb.toString();
    }
    //////////////METODOS/////////////////////

    /**
     * ●​ Un método equipar(Arma arma). Si están libres el arma derecha o izquierda,
     * asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se
     * puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos
     * brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha.
     */
    public boolean equipar(Arma arma) {

        boolean estaEquipada = false;

        // Primer caso --X
        // 1. Comprobar si el arma esta libre a dos manos
        // 2. Solo se puede poner si estan libres las dos manos
        // 3. Si estan libres las dos se pondr la misma arma
        // IMPORTANTE: Se empieza a equipar por la mano derecha
        if (arma.isDosManos() == true) {

            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                estaEquipada = true;
            }

        } else {

            // Segundo caso --x
            // 1. Si el arma derecha esta libre
            // 2. Si el arma izquierda esta libre
            // 3. Si estan ocupadas las dos

            if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                estaEquipada = true;

            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                estaEquipada = true;
            }
        }

        if (!estaEquipada) {
            System.out.println("Imposible equipar el arma, las dos manos estan ocuapadas");
        }
        return estaEquipada;
    }

    // Un método tomarPocion(int puntosS): método que sube la salud del jugador
    // tanto como indica puntosS,
    // hasta un máximo de 10000.

    public int tomarPocion(int puntosS) {
        this.salud += puntosS; // Subir el salud del jugador
        return (int) (this.salud = Math.min(this.salud, 1000)); // el maximo del salud es 10 000.
    }

    @Override
    public void subirNivel() {
        super.subirNivel();
    }

    @Override
    public boolean reducirVida(int puntosD) {
        return super.reducirVida(puntosD);
    }

    /**
     * Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como
     * sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es
     * doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente
     * reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del
     * monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de
     * experiencia será por tanto
     * 1000.
     */

    public void golpear(Personaje personaje) {

        if (this.getArmaDerecha() != null) {
            personaje.reducirVida(this.getArmaDerecha().getPuntpsD());
            if (!this.getArmaDerecha().isDosManos()) {
                if (this.getArmaIzquierda() != null)
                    personaje.reducirVida(this.getArmaIzquierda().getPuntpsD());
            }
        }

        // Comptobar si has matado al monstruo

        if (personaje.getSalud() <= 0) {
            this.experiencia += (int) (10 * personaje.getSalud());
        }

        // Subir la experiencia y el nivel si correspondira
        this.experiencia = Math.min(this.experiencia, 1000);

        if (this.experiencia % 100 == 0) {
            subirNivel();
        }

    }

}
