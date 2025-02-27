package Tema6.alquilarPelículas.entidades;

public class ClientePrime extends Cliente {

    /**
     * Atributo (Statico final)
     */
    public static final double precio_mensual = 3.0;

    /**
     * Constructor
     */
    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
        setPrecioMencual(precio_mensual);
    }


    /**
     * Implement los metodos
     * @return
     */
    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public double getPrecioMensual() {
        return precio_mensual;
    }

    /**
     * Paga el precio mensual mas el precio de la peliculas y series que no son  PLUS
     */

    public double calcularPrecio(double precioPelicula) {
        return precioPelicula + precio_mensual;
    }
}
