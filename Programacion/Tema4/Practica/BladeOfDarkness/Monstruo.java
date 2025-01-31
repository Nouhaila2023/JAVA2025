package Tema4.Practica.BladeOfDarkness;

public class Monstruo {
    private String nombre;
    private int nivel;
    private double salud;
    private int puntosD;
    enum Clase {GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA};
    private Clase clase;

    /*Constructor*/

    public Monstruo(String nombre, int puntosD, Clase clase) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.clase = clase;
        this.nivel = 1;
        this.salud = 100;
    }

    /*Getter and Setter*/

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

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /*toString*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", clase=").append(clase);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Un metodo para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2 elevado a nivel.
     * El nivel máximo es 10.
     */
    public void subirNivel(){
        this.nivel++;
        this.salud = Math.pow(2,nivel);
        nivel = Math.min(10,nivel);

        //Otro manera del maxiom

        /**
         * if (nivel <= 10){
         *             nivel++;
         *             salud = Math.pow(2,nivel);
         *         }
         */
    }

    /**
     * Un metodo reducirVida(int puntosD): reduce la propia salud del monstruo tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).
     */

    public boolean reducirVida(int puntosD){
        if (this.getSalud() <= 0){
            this.salud = 0;
            return true;
        }
        salud -= puntosD;
        return false;
    }

/**
 * ●​ Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
 * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
 */

    public void golpear(Jugador jugador){
        jugador.reducirVida(puntosD);
    }




}
