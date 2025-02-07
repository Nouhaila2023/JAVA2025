package Tema5.EjercicioPOO.Ejercicio3;

public class Test {
    public static void main(String[] args) {

        Libreria libreria = new Libreria();

        //Crearv10 libros
        Libro[] libros = {
                new Libro("A" , "1234567891","A",120),
                new Libro("B" , "1234567891","B",120),
                new Libro("C" , "1234567891","C",120),
                new Libro("D" , "1234567891","D",120),
                new Libro("E" , "1234567891","E",120),
                new Libro("F" , "1234567891","F",120),
                new Libro("G" , "1234567891","G",120),
                new Libro("H" , "1234567891","H",120),
                new Libro("I" , "1234567891","I",120),
                new Libro("J" , "1234567891","J",120),
        };

        double[] preciosCompra  = {12.0, 15.0, 10.0, 20.0, 14.0, 18.0, 22.0, 25.0, 13.0, 17.0};
        double[] preciosVenta = {18.0, 20.0, 15.0, 30.0, 20.0, 25.0, 30.0, 35.0, 18.0, 23.0};

        for (int i = 0; i < 10; i++) {
            libreria.adquirir(libros[i], preciosCompra[i]); // Se adquiere cada libro
            libreria.vender(libros[i], preciosVenta[i]); // Se vende cada libro
        }

        System.out.println("Ganancias totales de la librería: " + libreria.calcula() + "€");

    }
}
