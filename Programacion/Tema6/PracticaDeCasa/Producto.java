package Tema6.PracticaDeCasa;

public interface Producto {
    /**
     * Metodos a implementar:
     */

    String getCodigo();
    String getNombre();
    double getPrecio();
    int getStock();
    void setPrecio(double precio);
    void setStock(int stock);

    int getStock(int cantidad);

    void descontarStock(int cantidad);

    /**
     * Devuelve informacion derallada
     */

    String getInfo();



}
