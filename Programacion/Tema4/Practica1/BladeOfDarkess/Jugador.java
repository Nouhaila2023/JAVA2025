package Tema4.Practica1.BladeOfDarkess;

import com.sun.nio.sctp.SctpStandardSocketOptions;

public class Jugador {

    /////////// PROPIEDADES ///////////////////////
    private String nombre;
    private int nivel;
    private int experiencia;
    private double salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;
    public enum Tipo {Mago, Brujo, Barbaro, Caballero};
    private Tipo tipo;

    ///////////////Constructor///////////////
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }


    ///////////Get and Set ///////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    /// ///////////toString//////////////////////
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    //////////////METODOS/////////////////////

    // Un metodo para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2.5 elevado a
    //nivel. El nivel máximo es 10.

    public void subirNienel(){
        this.nivel++;
        double nuevaSalud = 2.5 * Math.pow(this.nivel, 2);

        // Actualizamos la salud actual
        this.salud += nuevaSalud;

        // Comrprobamos si el nivel es maximo de 10
        if(this.nivel >= 10){
            this.nivel = 10;

        }

    }

    /**
     * ●​ Un método equipar(Arma arma). Si están libres el arma derecha o izquierda, asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha.
     */
    public boolean equipar(Arma arma) {

        boolean estaEquipada = false;

        if (armaDerecha == null) {
            armaDerecha = arma;
            estaEquipada = true;
        }

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
            //1. Si el arma derecha esta libre
            //2. Si el arma izquierda esta libre
            //3. Si estan ocupadas las dos

            if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                estaEquipada = true;

            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                estaEquipada = true;
            }

        }

        if (estaEquipada == false) {
            System.out.println("Imposible equipar el arma, las dos manos estan ocuapadas");

        }
        return estaEquipada;
    }


    //Un método tomarPocion(int puntosS): método que sube la salud del jugador tanto como indica puntosS,
    //hasta un máximo de 10000.
    public int tomarPocion(int puntosS){
        this.salud += puntosS; //Subir el salud del jugador
        return (int) (this.salud = Math.min(this.salud, 1000)); //el maximo del salud es 10 000.
    }

/**
 * Un metodo reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
 * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
 * devuelve true (muerto).
 */

    public boolean reducirVida(int puntosD){
        if (this.getSalud() <= 0){
            salud = 0;
            return true;
        } else if (salud > 0) {
            salud--;
            System.out.println("Muerto");
            return false;
        }
        return false;//Despues vuelvo para ver que tengop que hacer
    }






}
