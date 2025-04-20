package tema7_2.practica2.bancosMart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {

    private UUID id;
    private Cliente propietario;
    private double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(UUID id, Cliente propietario, double saldo) {
        this.id = id;
        this.propietario = propietario;
        this.saldo = saldo;
        this.transacciones = new ArrayList<Transaccion>();
    }

    private void addTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);

    }

    public UUID getId() {
        return id;
    }

    public Cuenta setId(UUID id) {
        this.id = id;
        return this;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public Cuenta setPropietario(Cliente propietario) {
        this.propietario = propietario;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cuenta setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }


}
