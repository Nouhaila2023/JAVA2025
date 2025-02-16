package Tema5.Ejercicio1;

public abstract class  Personaje{

    /*Se creó Personaje como clase abstracta con propiedades y métodos comunes.
    Se movieron los atributos comunes (nombre, nivel, salud) a Personaje.
    Los métodos subirNivel() y reducirVida() se movieron a Personaje ya que son idénticos.
    El método golpear() se declaró abstracto en Personaje para que Jugador y Monstruo
    lo implementen de manera específica.*/

    private String nombre;
    private int nivel;
    double salud = 100;

    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
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

}
