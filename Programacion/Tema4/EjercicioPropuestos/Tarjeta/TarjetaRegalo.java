package Tema4.EjercicioPropuestos.Tarjeta;

public class TarjetaRegalo {

    /**
     * numero, saldo,. Gasta, getters y setters, toString,
     * fusionarTarjeta(TarjetaRegalo t)
     */

    private String numero;
    private double saldo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;

    }

    public TarjetaRegalo(int cantidad) {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void gasa(double cantidad) throws Exception {
        if ((this.saldo - cantidad) >= 0){
            this.saldo -= cantidad;
        }else {
            throw new Exception("La cantidad no valida:)");
        }
    }

}
