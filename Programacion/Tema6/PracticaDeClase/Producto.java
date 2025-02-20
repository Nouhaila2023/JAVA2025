package Tema6.PracticaDeClase;

public interface Producto {


    String getCodigo();
    String getNombre();
    double getPrecio();
    int getStock();
    String getInfo();

    void setPrecio(double precio);
    void setStock(int stock);
    public void  descontarStok(int cantidad);





}
