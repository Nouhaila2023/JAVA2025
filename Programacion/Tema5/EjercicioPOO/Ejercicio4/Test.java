package Tema5.EjercicioPOO.Ejercicio4;

public class Test {
    public static void main(String[] args) {

        Producto producto = new Producto(2323423, "PC", 500, 10, 50, 25 );
        producto.vender(5);
        producto.reponer();

        System.out.println(producto);




    }
}
