package tema7_2.practica2.bancosMart;


import java.util.*;
import java.util.stream.Collectors;



public class Banco {

    /**
     *Atributos
     */
    private List<Cuenta> cuentas;


    /**
     * Constructor vacio
     */
    public Banco() {
    }

    /**
     * addCuenta(Cuentas c)
     */
    private void addCuenta(Cuenta c){
        cuentas.add(c);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * getCuentasPorld(id)
     */

    public void getCuentasPorld(UUID id) {
        for (Cuenta c : cuentas){
            if (c.getId().equals(id)){
                System.out.println("EL id: " + id + " y existe");
            }
        }
    }

    /**
     * getTodasTransacciones -> devuelva lista con todas las transacciones del banco
     */

    public void getTodasTransacciones(){
        List<Transaccion> lista = new ArrayList<>();

        for (Transaccion t : lista){
            System.out.println(t);
        }

    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("cuentas=").append(cuentas);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Metodos Streams:
     */

    /**
     * 1. getTransaccionesImporteMinimo:  mostrar todas las transacciones con importe
     * superior a un valor dado (por ejemplo, 500€), ordenadas cronológicamente.
     * Filter y sorted
     */

    public void  getTransaccionesImporteMinimo(double valor){

        cuentas.stream()
                .flatMap( p -> p.getTransacciones().stream())
                .filter( p -> p.getImporte() > valor)
                .sorted()
                .forEach(System.out::println);

    }


    /**
     * 2. getIngresosTotales: el total de ingresos del banco.
     * Filter, reduce y summarizingDouble
     */

    public void getIngresosTotales(){

         DoubleSummaryStatistics dss =  cuentas.stream()
                .flatMap( p -> p.getTransacciones().stream())
                .filter( p -> p.getTipoTransaccion().equals(TipoTransaccion.INGRESO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));

    }

    /**
     * 3. getGastosTotales(): ídem para gastos
     */

    public void getGastosTotales(){

        DoubleSummaryStatistics dss =  cuentas.stream()
                .flatMap( p -> p.getTransacciones().stream())
                .filter( p -> p.getTipoTransaccion().equals(TipoTransaccion.GASTO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));

    }


    /*4. getCuentasPorSaldo(): mostrar las cuentas ordenadas por saldo de mayor a menor (sorted)*/

    public  void getCuentasPorSaldo(){
        cuentas.stream()
                .sorted(Comparator.comparing(tema7_2.practica2.bancosMart.Cuenta::getSaldo));
    }



    /*5. getNumTransaccionesPorCuenta(): generar un mapa donde las claves sean los ids de cuentas, y los
    valores sean el número de transacciones de cada cuenta. Collectors.groupingBy,
    Collectors.counting*/


    public void getNumTransaccionesPorCuenta(){
/*
        Map<UUID, Long> num = cuentas.stream()
                .collect(Collectors.groupingBy(Cuenta::getId),
                        Collectors.groupingBy());*/

    }























}
