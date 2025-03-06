package Tema6.monopoly.entidades;

public class Propiedad extends Casilla{
    /**
     * Atributos
     */
    private double precioCompra;
    private double precioPagar;//si alguien cae
    private Boolean con;


    /***
     * Constructor
     */
    public Propiedad(String nombre,Integer posicion,double precioCompra, double precioPagar,Boolean con) {
        super(nombre, posicion);
        this.precioCompra = precioCompra;
        this.precioPagar = precioPagar;
        this.con =con;
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

    public Boolean getCon() {
        return con;
    }

    public void setCon(Boolean con) {
        this.con = con;
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
        sb.append(", con").append(con);
        sb.append('}');
        return sb.toString();
    }
}
