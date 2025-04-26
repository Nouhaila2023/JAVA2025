package tema7_2.practica2.bancosMart;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    /**
     * Introduce datos de prueba, con al menos 10 cuentas y un número aleatorio (1-10) de transacciones en cada
     * una de ellas. Llama a cada uno de los métodos de Streams para probar que funcionan.
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

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


            int numTransacciones = numero_aleatorio(1,10);

            for (int j = 1; j <= numTransacciones; j++) {

                double importe = 50 + numTransacciones * 950; // entre 50€ y 1000€


                TipoTransaccion tipo = random.nextBoolean() ? TipoTransaccion.INGRESO : TipoTransaccion.GASTO;



                LocalDate fecha = LocalDate.now().minusMonths(random.nextInt(12)); // fechas de los últimos 12 meses

                String descripcion = tipo == TipoTransaccion.INGRESO ? "Ingreso de prueba " + j : "Gasto de prueba " + j;

                Transaccion transaccion = new Transaccion(cuenta, importe, fecha, tipo, descripcion);

            }

            // Añadir cuenta al banco
            addCuenta(cuenta);
        }

        // Llamar a los métodos para probarlos
        System.out.println("\n--- Transacciones con importe mínimo 500€ ---");
        getTransaccionesImporteMinimo(500);

        System.out.println("\n--- Ingresos totales del banco ---");
        getIngresoTotal();

        System.out.println("\n--- Gastos totales del banco ---");
        getGastoTotales();

        System.out.println("\n--- Cuentas ordenadas por saldo ---");
        getCuentasPorSaldo();

        System.out.println("\n--- Número de transacciones por cuenta ---");
        getNumTranccionesPorCuenta();

        System.out.println("\n--- Cuentas activas este mes ---");
        getCuentasActivas();

        System.out.println("\n--- Transacciones que contienen la palabra 'prueba' ---");
        getTransaccionesPorDescripcion("prueba");

        System.out.println("\n--- Análisis temporal de ingresos y gastos ---");
        showAnalisisTemporal();
    }

}
