package tema7_2.practica2.bancosMart;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Banc {

    /**
     * Atributos
     */

    private List<Cuenta> cuentas = new ArrayList<>();

    /**
     * Constructor vacio
     */
    public Banc() {
        this.cuentas = new ArrayList<>();
    }

    /**
     * addCuentas
     */

    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * getCuentaPorld -> id
     */

    public Cuenta getCuentaPorId(UUID id) {
        return cuentas.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    /**
     * getTodasTransacciones ->
     * devuelve todas las transacciones del banco
     */

    public List<Transaccion> getTodasTransacciones() {
        return cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .collect(Collectors.toList());
    }


    /******************************* Métodos Streams:*****************************************/

        /**
         * 1. getTransaccionesImporteMinimo(double valor): mostrar todas las transacciones con importe
         * superior a un valor dado (por ejemplo, 500€), ordenadas cronológicamente. Filter y sorted
         *
         * @return
         **/

        public void getTransaccionesImporteMinimo(double valor){
            cuentas.stream()
                    .flatMap( p -> p.getTransacciones().stream())
                    .filter(i -> i.getImporte() >= valor)
                    .sorted(Comparator.comparing(Transaccion::getImporte))
                    .forEach(System.out::println);

        }


        /**2. getIngresosTotales(): el total de ingresos del banco. Filter, reduce y summarizingDouble*/

        public void getIngresoTotal(){
            double totalIngreso = cuentas.stream()
                    .flatMap(e -> e.getTransacciones().stream())
                    .filter(p -> p.getTipoTransaccion().equals(TipoTransaccion.INGRESO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();

            System.out.println(totalIngreso);
        }


        /**3. getGastosTotales(): ídem para gastos*/

        public void getGastoTotal(){
            double gastoTotal = cuentas.stream()
                    .flatMap(p-> p.getTransacciones().stream())
                    .filter(p -> p.getTipoTransaccion() == TipoTransaccion.GASTO)
                    .mapToDouble(Transaccion::getImporte)
                    .sum();

            System.out.println(gastoTotal);
        }


        /**4. getCuentasPorSaldo(): mostrar las cuentas ordenadas por saldo de mayor a menor (sorted)*/

        public void getCuentasPorSaldo(){

            cuentas.stream()
                    .sorted( Comparator.comparing(tema7_2.practica2.bancosMart.Cuenta::getSaldo).reversed())
                    .forEach(System.out::println);
        }

        /**5. getNumTransaccionesPorCuenta(): generar un mapa donde las claves sean los ids de cuentas, y los
            valores sean el número de transacciones de cada cuenta. Collectors.groupingBy,
            Collectors.counting*/

        public Map<UUID, Long> getNumTransaccionesPorCuenta(){

            Map<UUID, Long> map = cuentas.stream()
                    .collect(Collectors.groupingBy(Cuenta::getId, Collectors.counting()));

            map.forEach((id, cantidad) ->
                    System.out.println("Cuenta " + id + " tiene " + cantidad + " transacciones.")
            );
            return map;
        }



    /**6. getCuentasActivas(): mostrar las cuentas que tengan al menos una transacción este mes*/

    public void getCuentasActivas() {
        LocalDate ahora = LocalDate.now();
        cuentas.stream()
                .filter(c -> c.getTransacciones().stream()
                        .anyMatch(t -> t.getFecha().getMonth() == ahora.getMonth() &&
                                t.getFecha().getYear() == ahora.getYear()))
                .forEach(System.out::println);
    }


    /**7. getTransaccionesPorDescripcion(String palabra): devuelve un mapa donde la clave sea el id de
            cuenta, y el valor un set de las transacciones de esa cuenta que contengan la palabra.*/

        public Map<UUID, Set<Transaccion>>  getTransaccionesPorDescripcion(String palabra){
             Map<UUID, Set<Transaccion>> ma =  cuentas.stream()
                     .collect(Collectors.toMap(
                             Cuenta::getId,
                             cuenta -> cuenta.getTransacciones().stream()
                                     .filter(t -> t.getDescripcion().contains(palabra))
                                     .collect(Collectors.toSet())
                     ));


            ma.forEach((c, v) ->
                    System.out.println("Cuenta " + c + " tiene " + v + " transacciones.")
            );

            return ma;

        }

        /**8. showAnalisisTemporal(): debe mostrar agrupadas por mes la suma total de ingresos y gastos:
            marzo 2025 – ingresos: 5000€, gastos: 3000€*/

        public void showAnalisisTemporal(){
            /*Scanner sc = new Scanner(System.in);
            System.out.println("Egrega el mes que quieres:");
            Month mes = Month.valueOf(sc.next());
            Map<LocalDate, Double> map = cuetas.stream()
                    .collect(Collectors.groupingBy()*/
            /*cuetas.stream()
                    .flatMap(f -> f.getTransacciones().stream())
                    .firstDayOfYear(p -> p.getFecha().getMonth() == mes
                    .filter(p -> p.getTipoTransaccion() == TipoTransaccion.GASTO)
                    .mapToDouble(Transaccion::getImporte)
                    .sum();*/

            Map<Month, List<Transaccion>> map = cuentas.stream()
                    .flatMap(c -> c.getTransacciones().stream())
                    .collect(Collectors.groupingBy(t -> t.getFecha().getMonth()));

            map.forEach((c, v) ->{
                System.out.println(c + "-");
                Double ingreso = v.stream()
                        .filter(p -> p.getTipoTransaccion() == TipoTransaccion.INGRESO)
                        .mapToDouble(Transaccion::getImporte)
                        .sum();

                Double gasto = v.stream()
                        .filter(p -> p.getTipoTransaccion() == TipoTransaccion.GASTO)
                        .mapToDouble(Transaccion::getImporte)
                        .sum();
                System.out.println("Ingreso " + ingreso + " gasto " + gasto);

            });


        }

}
