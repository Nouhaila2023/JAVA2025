package Tema6.alquilarPelículas.entidades;

public class ClientePrimePro extends Cliente {

    /**
     *Constructor
     */
    public ClientePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);
        setPrecioMencual(5);
    }

    /**
     * Implimente los metodos
     * @return
     */
    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public double getPrecioMensual() {
        return 5;
    }
}
