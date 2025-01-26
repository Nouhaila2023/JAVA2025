package Tema4.Practica1.BladeOfDarkess;

public class Monstruo {

    private String nombre;
    private int nivel = 1;
    private double salud = 100;
    private int puntosD; //Puntos de daño que el monstruo al golpear
    enum Tipo {Goblin, Troll, Skall, Demonio, Fantasma};
    private Tipo tipo;

    /// //////////METODOS/////////////////////////

    //Construres
    public Monstruo(Tipo tipo, int puntosD, String nombre) {
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.nombre = nombre;
    }
    /////////Get and Set /////////////////////////
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

    public void setSalud(int salud) {
        this.salud = salud;
    }

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
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2 elevado a nivel.
     * El nivel máximo es 10.
     */


    public void subirNivel(){
        //Subir el nivel
        if(nivel <= 10){
            nivel++;
        }
        //Subir el salud
        double nuevaSalud = Math.pow(2,this.nivel);

        // Actualizamos la salud actual
        this.salud += nuevaSalud;
    }

    /**
     * Un método reducirVida(int puntosD): reduce la propia salud del monstruo tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).
     */


    public boolean reducirVida(int puntosD){

        if (this.salud <= 0){
            salud = 0;
            return true;
        }else {
            salud -= puntosD;
            return false;
        }

    }


    /**
     * Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador
     */

    public void golpear(Jugador jugador){

        jugador.reducirVida(puntosD);

    }













}
