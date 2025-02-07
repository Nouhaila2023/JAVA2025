package Tema5.EjercicioPOO.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libreria {
    //array (ArrayList) de 1000
    private ArrayList<Libro> libros;

    //constructor para el arrayList

    public Libreria() {
        this.libros = new ArrayList<>();
    }


    //El metodo adquirir asignará
    //un precio_compra al libro y lo añadirá a la librerí

    public void adquirir (Libro libro, double precioCompra){
        if (libros.size() <=  1000){
            libro.setPrecio_compra(precioCompra);
            libros.add(libro);
            System.out.println("Libro adquirido: " + libro.getTitulo() + " por " + precioCompra + "€");
        }else {
            System.out.println("No se pueden adquirir más.");
        }
    }

    //El metodo vender pondrá el precio de venta y le
    //cambiará el estado a “vendido = true”
    public void vender(Libro libro, double precioVenta){

        if(!libro.isVendido()){
            libro.setPrecio_venta(precioVenta);
            libro.setVendido(true);
            System.out.println("Le precio del libre " + libro.getTitulo() + " es " + precioVenta + "€");
        }else {
            System.out.println("Esta libro ha sido vendido.");
        }
    }

    //Finalmente crea un metodo en Librería que calcule las
    //ganancias de todos los libros que hayas vendido.

    public double calcula(){
        double total = 0;
        for (Libro libro : libros) {
            if (libro.isVendido()) {
                total += (libro.getPrecio_venta() - libro.getPrecio_compra());
            }
        }
        return total;
    }

}
