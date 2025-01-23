package Tema5.Practica.Rectangulo;

import java.util.Objects;

public class Rectangulo {
    private double alto;
    private double ancho;

    //Constructor

    public Rectangulo(double lado, double ancho) {
        this.alto = lado;
        this.ancho = ancho;
    }
    //Constructor copia
    public Rectangulo(Rectangulo otro) {
        this.alto = otro.alto;
        this.ancho = otro.ancho;
    }

    //Geter and Setter
    public double getLado() {
        return alto;
    }

    public void setLado(double lado) {
        this.alto = lado;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Incrementar el alto
    public Rectangulo incrementarAlto() {
        this.alto++;
        return this;
    }
    //Decrementar el alto
    public Rectangulo decrementAlto() {
        this.alto--;
        return this;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("lado=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append('}');
        return sb.toString();
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(alto, that.alto) == 0 && Double.compare(ancho, that.ancho) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto, ancho);
    }
}
