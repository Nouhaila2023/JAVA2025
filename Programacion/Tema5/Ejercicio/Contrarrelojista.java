package Tema5.Ejercicio;

public class Contrarrelojista extends Ciclista {

    //Atributo
    private double volocidadMaxima;

    //Constructor
    public Contrarrelojista(int identificador, String nombreCiclista, int tiempoAcumulado, double volocidadMaxima) {
        super(identificador, nombreCiclista, tiempoAcumulado);
        this.volocidadMaxima = volocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }

    //Getter and Setter
    public double getVolocidadMaxima() {
        return volocidadMaxima;
    }

    public void setVolocidadMaxima(double volocidadMaxima) {
        this.volocidadMaxima = volocidadMaxima;
    }

    //toStinrg


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contrarrelojista{");
        sb.append(super.toString());
        sb.append("volocidadMaxima=").append(volocidadMaxima);
        sb.append('}');
        return sb.toString();
    }
}
