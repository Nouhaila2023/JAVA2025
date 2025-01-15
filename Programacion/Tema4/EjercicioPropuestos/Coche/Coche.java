package Tema4.EjercicioPropuestos.Coche;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private double largo;
    private double ancho;
    private double alto;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", largo=").append(largo);
        sb.append(", ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append('}');
        return sb.toString();
    }
}
