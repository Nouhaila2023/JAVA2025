package Tema5.Ejercicio;

public class Velocista extends Ciclista {
    // • Velocista: tiene nuevos atributos como potencia promedio (en vatios) y velocidad promedio
    //    en sprint (Km/h) (ambos de tipo double)

    //Atributos
    private double potenciaPromedio;//en vatios
    private double velocidadPromedio;//(km/h)

    //Constructor
    public Velocista(int identificador, String nombreCiclista, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombreCiclista, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "";
    }

    //Getter And Setter
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Velocidad{");
        sb.append(super.toString());
        sb.append("potenciaPromedio=").append(potenciaPromedio);
        sb.append(", velocidadPromedio=").append(velocidadPromedio);
        sb.append('}');
        return sb.toString();
    }
}
