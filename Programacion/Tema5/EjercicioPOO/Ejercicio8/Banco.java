package Tema5.EjercicioPOO.Ejercicio8;

import java.util.ArrayList;

public class Banco {
    //La clase Banco tiene un arrayList de clase padre CuentasBancarias
    private ArrayList<CuentaBancaria> cuentaBancarias;

    //Constructor del arrayList
    public Banco(ArrayList<CuentaBancaria> cuentaBancarias) {
        this.cuentaBancarias = cuentaBancarias;
    }

    //Crear un metodo addCuenta(cuentaBancaria cb) que añada una cuenta al banco
    public void addCuenta(CuentaBancaria cb){
        this.cuentaBancarias.add(cb);
    }

    //sobreecribe el metodo toStrong() para que vaya llamando al toString() de todas las cuentas que tiene dentro
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("cuentaBancarias=").append(cuentaBancarias);
        sb.append('}');
        return sb.toString();
    }

    //Implementa un metodo getCuenta(numeroDeCuenta), que te devuelva la cantidad dentro
    //swl banco que coincida con ese numero de cuenta
    public CuentaBancaria getCuenta(String numeroCuenta){
        CuentaBancaria cb1 =new CuentaBancaria(0.0,true,true,0.0,0.0);
        cb1.setNumeroCuenta(numeroCuenta);
        int position= this.cuentaBancarias.indexOf(cb1);
        if (position < 0) {
            return null;
        }
        else
            return this.cuentaBancarias.get(position);
    }





}
