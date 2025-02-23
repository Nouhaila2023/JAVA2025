package Tema6.practicaCasa.entidades.interfaces;

public interface Producto {

    /**
     * Metodos a implementar
     */

    String getCodigo();
    String getNombre();
    double getPrecio();
    int getStock();

    void descontarStock(int cantidad);

    String getInfo();//Devuelve informacion detallada

    void setPrecio(double precio);
    void setStock(int stock);



}
