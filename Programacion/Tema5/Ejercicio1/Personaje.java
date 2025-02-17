package Tema5.Ejercicio1;

public abstract class  Personaje{

    /*Se creó Personaje como clase abstracta con propiedades y métodos comunes.
    Se movieron los atributos comunes (nombre, nivel, salud) a Personaje.
    Los métodos subirNivel() y reducirVida() se movieron a Personaje ya que son idénticos.
    El método golpear() se declaró abstracto en Personaje para que Jugador y Monstruo
    lo implementen de manera específica.*/

    protected String nombre;
    protected int nivel;
    protected double salud = 100;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }


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

   public abstract void golpear(Personaje personaje);



}
