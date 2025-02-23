package Tema6.practicaCasa.entidades;

public class Equipamiento extends ProductoBase{

    /**
     * Atributos sdicionales:
     */
    private String deporte;
    private String marca;

    /*Constructor*/
    public Equipamiento(String codigo, String nombre, double precio, int stock, String deporte, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.deporte = deporte;
        this.marca = marca;
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
