package Tema4.EjerciciosPracticos.Ejercicio5;

public class Satelite {
    private  double meridiano;
    private double paralelo;
    private double distancia_tierra;

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
