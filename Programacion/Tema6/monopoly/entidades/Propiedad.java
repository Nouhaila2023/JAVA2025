package Tema6.monopoly.entidades;

public class Propiedad extends Casilla{
    /**
     * Atributos
     */
    private double precioCompra;
    private double precioPagar;//si alguien cae

    /***
     * Constructor
     */
    public Propiedad(String nombre, double precioCompra, double precioPagar) {
        super(nombre);
        this.precioCompra = precioCompra;
        this.precioPagar = precioPagar;
    }

    /**
     * Getter Setter
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    public Propiedad setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
        return this;
    }

    public double getPrecioPagar() {
        return precioPagar;
    }

    public Propiedad setPrecioPagar(double precioPagar) {
        this.precioPagar = precioPagar;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propiedad{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precioPagar=").append(precioPagar);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }
}
