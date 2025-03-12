package Tema6.tiendaDeportes.entidades;

import Tema6.tiendaDeportes.entidades.enuM.Talla;
import Tema6.tiendaDeportes.entidades.enuM.TipoRopa;

public class Ropa extends Producto {

    /**
     * Atributos
     */

    private Talla talla;
    private String color;
    private TipoRopa tipoRopa;

    /**
     * Constructor
     * @param nombre
     * @param descripcion
     * @param precio
     * @param unidadesStock
     * @param talla
     * @param color
     * @param tipoRopa
     */
    public Ropa(String nombre, String descripcion, double precio,
                int unidadesStock, Talla talla, String color, TipoRopa tipoRopa) {
        super(nombre, descripcion, precio, unidadesStock);
        this.talla = talla;
        this.color = color;
        this.tipoRopa = tipoRopa;
    }

    /**
     * Constructor copia
     * @param otro
     */
    public Ropa(Ropa otro) {
        super(otro);
        this.talla = otro.talla;
        this.color = otro.color;
        this.tipoRopa = otro.tipoRopa;
    }

    /**
     * Metodos ampliados
     */

    public double descuento() {
        if (this.talla.equals(Talla.XS) || this.talla.equals(Talla.XXL)) {
            return getPrecio()*0.05;
        }else {
            return getPrecio()*0.03;
        }

    }




    /**
     * Getter Setter
     */
    public Talla getTalla() {
        return talla;
    }

    public Ropa setTalla(Talla talla) {
        this.talla = talla;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Ropa setColor(String color) {
        this.color = color;
        return this;
    }

    public TipoRopa getTipoRopa() {
        return tipoRopa;
    }

    public Ropa setTipoRopa(TipoRopa tipoRopa) {
        this.tipoRopa = tipoRopa;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ropa{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append(", talla=").append(talla);
        sb.append(", tipoRopa=").append(tipoRopa);
        sb.append('}');
        return sb.toString();
    }
}
