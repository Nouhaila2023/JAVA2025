package Tema6.monopoly.entidades;

public class Propiedad extends Casilla{
    /**
     * Atributos
     */
    private double precioCompra;
    private double precioPagar;//si alguien cae
    private boolean comprada;

    /***
     * Constructor
     */
    public Propiedad(String nombre,Integer posicion,double precioCompra, double precioPagar,Boolean comprada) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioPagar = precioPagar;
        this.comprada =comprada;
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

    public Boolean getComprada() {
        return comprada;
    }

    public void setConprada(Boolean con) {
        this.comprada = con;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propiedad{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", posicion=").append(posicion);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append(", precioPagar=").append(precioPagar);
        sb.append(", con").append(comprada);
        sb.append('}');
        return sb.toString();
    }
}
