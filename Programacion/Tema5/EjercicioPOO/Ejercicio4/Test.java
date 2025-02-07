package Tema5.EjercicioPOO.Ejercicio4;

import Tema5.EjercicioPOO.Ejercicio5.Tienda;

public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Producto pc = new Producto(23, "PC", 500, 10, 50, 25 );
        pc.vender(5);
        pc.reponer();

        System.out.println(pc);

        Producto tv = new Producto(2, "tv", 300, 5, 30, 10);

        tienda.adquirirProd(tv);
        System.out.println(pc);
        tienda.venderProd(2,4);
        tienda.venderProd(3,1);

        System.out.println(tienda);




    }
}
