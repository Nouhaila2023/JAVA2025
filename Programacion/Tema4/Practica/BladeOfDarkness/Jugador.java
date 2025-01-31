package Tema4.Practica.BladeOfDarkness;

public class Jugador {
    /*Propiedades*/
    private String nombre;
    private int nivel;
    private int experiencia;
    private double salud;
    Arma armaDerecha;
    Arma armaIzquierda;
    enum Clase {MAGO, BRUJO, BARBARO, CABALLERO};
    private Clase clase;

    /*Metodos*/

    /**
     * Debes hacer el constructor parametrizado, menos nivel que será por defecto 1, salud por defecto 200,
     * experiencia 0 por defecto, ni las armas que serán null.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    /*Geters and Setters*/
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

    public void setSalud(double salud) {
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

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /*toString*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append(", clase=").append(clase);
        sb.append('}');
        return sb.toString();
    }

    /**
     *Un metodo para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2.5 elevado a
     * nivel. El nivel máximo es 10.
     */

    public void subirNivel(){
        this.nivel++;
        this.salud = Math.pow(2.5,nivel);
        nivel = Math.min(10,nivel);

        //Otro manera del maxiom

        /**
         * if (nivel <= 10){
         *             nivel++;
         *             salud = Math.pow(2.5,nivel);
         *         }
         */
    }

    /**
     * Un metodo equipar(Arma arma). Si están libres el arma derecha o izquierda, asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha
     */

    public boolean equipar(Arma arma){

        if (arma.isDosManos()==true){
            if (armaDerecha == null && armaIzquierda == null){
                armaDerecha = arma;
                armaIzquierda = arma;
                return true;
            }
        }else {

            if (armaDerecha == null){
                armaDerecha = arma;
                return true;
            }else{
                armaIzquierda = arma;
                return true;
            }
        }

        if (armaDerecha != null && armaIzquierda != null){
            System.out.println("Estan ocupados!!!");
        }

        return false;
    }

    /**
     * Un metodo tomarPocion(int puntosS): metodo que sube la salud del jugador tanto como indica puntosS,
     * hasta un máximo de 10000.
     * @param puntosD
     */
    public void tomarPocion(int puntosD){
        if (this.salud <= 1000){
            this.salud -= puntosD;
        }

    }

    /**
     * Un metodo reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).
     */

    public boolean reducirVida(int puntosD){
        if (this.salud >= 0){
            this.salud = 0;
            return true;
        }
        this.salud -= puntosD;
        return false;
    }

    /**
     * Un metodo golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     */


    public void golpear(Monstruo monstruo){
        if (this.getArmaDerecha() != null){
           monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.getArmaDerecha().isDosManos()){
                if (this.getArmaIzquierda() != null){
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }

        /*Comprobar si has matado al monstruo*/
        if (monstruo.getPuntosD() == 0){
            System.out.println("Han matado el Monstruo");
            experiencia += (10*monstruo.getSalud());
        }

        /*Subir la experiencia y el nivel si correspondiera*/
        if (experiencia >= 1000){
            if (this.experiencia % 100 == 0){
                subirNivel();
            }

        }


    }



}
