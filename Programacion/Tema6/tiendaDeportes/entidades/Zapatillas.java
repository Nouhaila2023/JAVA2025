package Tema6.tiendaDeportes.entidades;

import Tema6.tiendaDeportes.entidades.enuM.Categoria;
import Tema6.tiendaDeportes.entidades.enuM.NumeroZ;

public class Zapatillas extends Producto {

    /**
     * Atributos
     */
    private Categoria categoria;
    private NumeroZ numeroZ;


    /**
     * Constructor
     * @param nombre
     * @param descripcion
     * @param precio
     * @param unidadesStock
     *
     */

    public Zapatillas(String nombre, String descripcion,
                      double precio, int unidadesStock,
                      Categoria categoria, NumeroZ numeroZ) {
        super(nombre, descripcion, precio, unidadesStock);
        this.categoria = categoria;
        this.numeroZ = numeroZ;
    }

    /**
     * Constructor copia
     * @param otro
     */
    public Zapatillas(Zapatillas otro) {
        super(otro);
        this.categoria = otro.categoria;
        this.numeroZ = otro.numeroZ;
    }

    /**
     * Metodos ampliados
     */

    public double descuento() {
        if (this.numeroZ == (NumeroZ.T35)
        || this.numeroZ == (NumeroZ.T50)
        || this.numeroZ == (NumeroZ.T47)
        || this.numeroZ == (NumeroZ.T48)
        || this.numeroZ == (NumeroZ.T49)){
            return this.precio * 0.05;
        }else {
            return this.precio * 0.03;
        }
    }

    /**
     * Getter Setter
     */
    public Categoria getCategoria() {
        return categoria;
    }

    public Zapatillas setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public NumeroZ getNumeroZ() {
        return numeroZ;
    }

    public Zapatillas setNumeroZ(NumeroZ numeroZ) {
        this.numeroZ = numeroZ;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zapatillas{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append(", categoria=").append(categoria);
        sb.append(", numeroZ=").append(numeroZ);
        sb.append('}');
        return sb.toString();
    }
}
