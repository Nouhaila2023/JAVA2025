package Tema7.corsoGenericosColecciones.clecciones.list;

public class Prodocto {
    private String nombre;
    private double precio;

    public Prodocto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Prodocto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Prodocto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prodocto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
