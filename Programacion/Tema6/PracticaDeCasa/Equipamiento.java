package Tema6.PracticaDeCasa;

public class Equipamiento extends ProductoBase{

    /**
     * Atributos adicionales:
     */
    private String deporte;
    private String marca;

    /**
     * Constructor
     *
     * @param codigo
     * @param nombre
     * @param precio
     * @param stock
     */
    public Equipamiento(String codigo, String nombre, double precio, int stock, String deporte, String marca) {
        super(codigo, nombre, precio, stock);
        this.deporte = deporte;
        this.marca = marca;
    }


    @Override
    public int getStock() {
        return 0;
    }

    /**
     * Implementa getInfo():
     * • Debe mostrar los datos generales junto con los específicos.
     * @return
     */
    @Override
    public String getInfo() {
        return "Equipamiento: " + nombre + " | Código: " + codigo + " | Precio: " + precio +
                " | Stock: " + stock + " | Deporte: " + deporte + " | Marca: " + marca;
    }

    /**
     * Getter and Setter
     */
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", deporte='").append(deporte).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
