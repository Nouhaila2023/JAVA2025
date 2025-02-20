package Tema6.PracticaDeClase;

public abstract class ProductoBasa implements Producto{

    //Atributos
    protected String codigo;
    protected String nombre;
    protected double precion;
    protected int stock;

    //Constructor
    public ProductoBasa(String codigo, String nombre, double precion, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precion = precion;
        this.stock = stock;
    }

    //Getter and Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecion() {
        return precion;
    }

    public void setPrecion(double precion) {
        this.precion = precion;
    }

    //metodo abstracto
    public abstract int getStock();

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void descontarStok(int cantidad) {

    }


}
