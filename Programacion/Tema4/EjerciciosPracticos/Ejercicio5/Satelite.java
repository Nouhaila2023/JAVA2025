package Tema4.EjerciciosPracticos.Ejercicio5;

public class Satelite {

    /**
     * Modifica la clase Satélite y añádele los siguientes métodos:
     * - Metodo void variaAltura(double desplazamiento). Este método acepta un parámetro que
     * será positivo o negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
     * - Método boolean enOrbita(). Este método devolverá false si el satélite está en tierra y true en caso
     * contrario.
     * - Método void variaPosicion(double variap, double variam). Este método permite
     * modificar los atributos de posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos
     * parámetros serán valores positivos o negativos relativos que harán al satélite modificar su posición.
     */
    private  double meridiano;
    private double paralelo;
    private double distancia_tierra;

    //Constructor
    public Satelite(double meridiano, double paralelo, double distancia_tierra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia_tierra = distancia_tierra;
    }


    public Satelite() {
        meridiano=paralelo=distancia_tierra=0;
    }

    public void setPosicion(double m , double p, double d){
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosision(){
        System.out.println("El setelite es encuentra es:");
        System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
        System.out.print(" a una distancia de la Tierra de" + distancia_tierra + " kms.");
    }

    public void variaAltura(double desplazamiento){

    }
}
