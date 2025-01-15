package Tema4.EjercicioPropuestos.Tarjeta;

public class TarjetaRegalo {

    /**
     * numero, saldo,. Gasta, getters y setters, toString,
     * fusionarTarjeta(TarjetaRegalo t)
     */

    public String numero;
    public double saldo;
    public static Integer numeroTarjeta = 0;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        TarjetaRegalo.numeroTarjeta++;
        this.numero = "Tarjeta " + TarjetaRegalo.numeroTarjeta + ": ";
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

    public static Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public static void setNumeroTarjeta(Integer numeroTarjeta) {
        TarjetaRegalo.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void fusionarTarjeta(TarjetaRegalo t){
        this.saldo += t.getSaldo();
        t.setSaldo(0.0);
    }


}
