package Tema4.EjercicioPropuestos.CuentaCorriente;

public class CuentaCorriente {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public String numero;
    public double saldo;
    public static Integer numeroCuenta = 0;
    //ES1234-generarnum-1

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        CuentaCorriente.numeroCuenta++;
        this.numero = "ES" + numero_aleatorio(1000,9999) + "-"+ CuentaCorriente.numeroCuenta;
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

    public static Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void setNumeroCuenta(Integer numeroCuenta) {
        CuentaCorriente.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaCorriente{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void ingreso(double monto){
        this.saldo += monto;
    }
    public void transferencia(double monto) throws Exception {
        if (this.saldo - monto >= 0){
            this.saldo -= monto;
        }else{
            throw  new Exception("No hay saldo suficiente");
        }
    }

}
