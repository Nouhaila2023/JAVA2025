package Tema4.EjercicioPropuestos.CuentaCorriente;

import org.w3c.dom.ls.LSOutput;

public class TestCuenta {
    public static void main(String[] args) throws Exception {

        CuentaCorriente C1 = new CuentaCorriente(100);
        CuentaCorriente C2 = new CuentaCorriente(200);

        System.out.println(C1);
        System.out.println(C2);

        C1.ingreso(20);
        try {
            C2.transferencia(10000);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("------------------");
        System.out.println("Ingreso: " + C1);
        System.out.println("Transferencia: " + C2);

        System.out.println("------------------");
        C1.transferencia(1);
        System.out.println("Transferencia: " + C1);


    }

}
