package tema7_2.practica2.bancosMart;


import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Banc {

    /**
     * Atributos
     */

    private List<Cuenta> cuetas;

    /**
     * Constructor vacio
     */
    public Banc() {
    }

    /**
     * addCuentas
     */

    public void addCuenta(Cuenta cuenta) {
        cuetas.add(cuenta);
    }

    /**
     * getCuentaPorld -> id
     */

    public void getCuentaPorld(UUID id){
        if (cuetas.contains(id)){
            System.out.println("El cuenta ya existe");
        }
    }

    /**
     * getTodasTransacciones ->
     * devuelve todas las transacciones del banco
     */

    public void getTodasTransacciones(){
        for (Cuenta cuenta : cuetas) {
            for (Transaccion transaccion : cuenta.getTransacciones()) {
                System.out.println(transaccion);
            }
        }
    }

            /******************************* Métodos Streams:*****************************************/

        /**1. getTransaccionesImporteMinimo(double valor): mostrar todas las transacciones con importe
            superior a un valor dado (por ejemplo, 500€), ordenadas cronológicamente. Filter y sorted**/

        public void getTransaccionesImporteMinimo(double valor){
            cuetas.stream()
                    .flatMap( p -> p.getTransacciones().stream())
                    .filter(i -> i.getImporte() >= valor)
                    .sorted(Comparator.comparing(Transaccion::getImporte))
                    .forEach(System.out::println);
        }


        /**2. getIngresosTotales(): el total de ingresos del banco. Filter, reduce y summarizingDouble*/

        public void getIngresoTotal(){
            double totalIngreso = cuetas.stream()
                    .flatMap(e -> e.getTransacciones().stream())
                    .filter(p -> p.getTipoTransaccion().equals(TipoTransaccion.INGRESO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();

            System.out.println(totalIngreso);
        }


        /**3. getGastosTotales(): ídem para gastos*/

        public void getGastoTotales(){
            double gastoTotal = cuetas.stream()
                    .flatMap(p-> p.getTransacciones().stream())
                    .filter(p -> p.getTipoTransaccion() == TipoTransaccion.GASTO)
                    .mapToDouble(Transaccion::getImporte)
                    .sum();

            System.out.println(gastoTotal);
        }


        /**4. getCuentasPorSaldo(): mostrar las cuentas ordenadas por saldo de mayor a menor (sorted)*/

        public void getCuentasPorSaldo(){

            cuetas.stream()
                    .sorted( Comparator.comparing(tema7_2.practica2.bancosMart.Cuenta::getSaldo).reversed())
                    .forEach(System.out::println);
        }

        /**5. getNumTransaccionesPorCuenta(): generar un mapa donde las claves sean los ids de cuentas, y los
            valores sean el número de transacciones de cada cuenta. Collectors.groupingBy,
            Collectors.counting*/

        public void getNumTranccionesPorCuenta(){
            Map<UUID, Long> map = cuetas.stream()
                    .collect(Collectors.groupingBy(Cuenta::getId, Collectors.counting()));

            map.forEach((id, cantidad) ->
                    System.out.println("Cuenta " + id + " tiene " + cantidad + " transacciones.")
            );
        }


        /**6. getCuentasActivas(): mostrar las cuentas que tengan al menos una transacción este mes*/

        public void getCuentasActivas(){
            cuetas.stream()
                    .flatMap(p -> p.getTransacciones().stream())
                    .filter(p -> p.getFecha().getMonth() == Month.APRIL
                    && p.getFecha().getYear() == 2025)
                    .forEach(System.out::println);
        }

        /**7. getTransaccionesPorDescripcion(String palabra): devuelve un mapa donde la clave sea el id de
            cuenta, y el valor un set de las transacciones de esa cuenta que contengan la palabra.*/

        public void getTransaccionesPorDescripcion(String palabra){
             Map<UUID, Set<Transaccion>> ma =  cuetas.stream()
                     .collect(Collectors.toMap(
                             Cuenta::getId,
                             cuenta -> cuenta.getTransacciones().stream()
                                     .filter(t -> t.getDescripcion().contains(palabra))
                                     .collect(Collectors.toSet())
                     ));


            ma.forEach((c, v) ->
                    System.out.println("Cuenta " + c + " tiene " + v + " transacciones.")
            );

        }

        /**8. showAnalisisTemporal(): debe mostrar agrupadas por mes la suma total de ingresos y gastos:
            marzo 2025 – ingresos: 5000€, gastos: 3000€*/

        public void showAnalisisTemporal(){



        }

}
