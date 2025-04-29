package tema7_2.practica2.bancosMart;

import java.time.LocalDate;
import java.util.Random;


public class App {
    /**
     * Introduce datos de prueba, con al menos 10 cuentas y un número aleatorio (1-10) de transacciones en cada
     * una de ellas. Llama a cada uno de los métodos de Streams para probar que funcionan.
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Banc banco = new Banc();

        // Crear 10 clientes y sus cuentas
        for (int i = 1; i <= 10; i++) {
            Cliente cliente = new Cliente(
                    "DNI" + i,
                    "Cliente " + i,
                    "cliente" + i + "@correo.com",
                    "60000000" + i,
                    "Calle " + i,
                    "Ciudad " + i,
                    "Pais " + i
            );

            Cuenta cuenta = new Cuenta(cliente);


            int numTransacciones = numero_aleatorio(1, 10);

            for (int j = 0; j < numTransacciones; j++) {
                double importe = numero_aleatorio(50, 1000);

                TipoTransaccion tipo;
                Random random = new Random();

                if (random.nextBoolean()) {
                    tipo = TipoTransaccion.INGRESO;
                } else {
                    tipo = TipoTransaccion.GASTO;
                }

                LocalDate fecha = LocalDate.now().minusMonths(random.nextInt(12));

                String descripcion;
                if (tipo == TipoTransaccion.INGRESO) {
                    descripcion = "Ingreso " + j;
                } else {
                    descripcion = "Gasto " + j;
                }

                Transaccion transaccion = new Transaccion(cuenta, importe, fecha, tipo, descripcion);
                cuenta.addTransaccion(transaccion);

            }
            banco.addCuenta(cuenta);
        }


        System.out.println("\n*=== TRANSACCIONES > 500€ ===*");
        banco.getTransaccionesImporteMinimo(500);

        System.out.println("\n*=== INGRESOS TOTALES ===*");
        banco.getIngresoTotal();

        System.out.println("\n*=== GASTOS TOTALES ===*");
        banco.getGastoTotal();

        System.out.println("\n*=== CUENTAS ORDENADAS POR SALDO ===*");
        banco.getCuentasPorSaldo();

        System.out.println("\n*=== NUMERO DE TRANSACCIONES POR CUENTA ===*");
        banco.getNumTransaccionesPorCuenta();

        System.out.println("\n*=== CUENTAS ACTIVAS ESTE MES ===*");
        banco.getCuentasActivas();

        System.out.println("\n*=== TRANSACCIONES CON DESCRIPCIÓN 'compra' ===*");
        banco.getTransaccionesPorDescripcion("compra");

        System.out.println("\n*=== ANÁLISIS TEMPORAL ===*");
        banco.showAnalisisTemporal();




    }

}
