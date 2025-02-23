package Tema6.practicaCasa.entidades;

public class RopaDeportiva extends ProductoBase{

    /**
     * Atributos adicionales:
     */

    private String talla;
    private String material;

    /*Constructor*/

    public RopaDeportiva(String codigo, String nombre, double precio, int stock, String talla, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.talla = talla;
        this.material = material;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    };
    @Override
    public void setStock(int stock) {
        this.stock = stock;
    };


    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", talla='").append(talla).append('\'');
        sb.append(", material='").append(material).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
