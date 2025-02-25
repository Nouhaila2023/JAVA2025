package Tema6.alquilerPeliculas.entidades;

public class ClientePrime extends Cliente {


    public static final double precioMencual = 3.0;

    /**
     * Constructores menos precioMensual
     *
     * @param dni
     * @param nombre
     * @param email
     */
    public ClientePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);
        setPrecioMensual(precioMencual);
    }

    /**
     * esPro() devuelve false
     */
    public boolean esPro(){
        return false;
    }

    /**
     * Devuelve 3
     * @return
     */
    @Override
    public double getPrecioMensual() {
        return 3;
    }

    /**
     * Paga el precio mensual más el precio de las películas y series que no son “plus”
     */

    public double pago(double precio){
        return precio + getPrecioMensual();
    }

}
