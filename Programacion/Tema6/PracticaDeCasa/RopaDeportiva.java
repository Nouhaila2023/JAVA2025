package Tema6.PracticaDeCasa;

public class RopaDeportiva extends ProductoBase{

    /**
     * Atributos adicionales
     */

    private String talla;
    private String matricula;

    /**
     * Constructor
     *
     * @param codigo
     * @param nombre
     * @param precio
     * @param stock
     */
    public RopaDeportiva(String codigo, String nombre, double precio, int stock, String talla, String matricula) {
        super(codigo, nombre, precio, stock);
        this.talla = talla;
        this.matricula = matricula;
    }


    @Override
    public int getStock() {
        return 0;
    }

    /**
     * Implementa getInfo();
     * Mostrar todos los detalles del producto
     * @return
     */
    @Override
    public String getInfo() {
        return "Ropa Deportiva: " + nombre + " | Código: " + codigo + " | Precio: " + precio +
                " | Stock: " + stock + " | Talla: " + talla + " | Material: " + matricula;
    }

    /**
     * Getter and Setter
     */
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", talla='").append(talla).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
