package Tema6.alquilerPeliculas.entidades;

public class ClientePrimePro extends Cliente {

    private double precioMensual;

    /**
     * Constructor
     */

    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
        this.precioMensual = 5;
    }

    /**
     * Metodos abstracta
     * @return
     */
    @Override
    public double getPrecioMensual() {
        return 5;
    }

    @Override
    public boolean esPro() {
        return true;
    }


}
