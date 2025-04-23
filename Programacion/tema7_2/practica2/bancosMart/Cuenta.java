package tema7_2.practica2.bancosMart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {

    /**
     * Atributos
     */
    private UUID id;
    private Cliente propietario;
    private double saldo;
    private List<Transaccion> transacciones;

    /**
     * Constructor
     * @param id
     * @param propietario
     */
    public Cuenta(UUID id, Cliente propietario) {
        this.id = id;
        this.propietario = propietario;
        this.saldo = 0.0;
        this.transacciones = null;
    }

    /**
     * añadir la transaccion a la lista y actualiza el sueldo dependienda
     * del tiop de transaccion
     * @param transaccion
     */
    private void addTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);

        if (transaccion.getTipoTransaccion().equals(TipoTransaccion.GASTO)) {
            this.saldo += transaccion.getImporte();
        } else if (transaccion.getTipoTransaccion().equals(TipoTransaccion.INGRESO)){
            this.saldo += transaccion.getImporte();
        }else {
            System.out.println("No pudemos añadir el transaccion");
        }
    }

    /**
     * Getter Setter
     */

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }


    /**
     * toString que muestre -> (dni, salado)
     */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuenta{");
        sb.append("id=").append(id);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }


}
