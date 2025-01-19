package Tema4.EjerciciosPracticos.Ejercicio7;

public class Incidencia {
    /**
     * Implementa una clase Incidencia. Queremos resolver el problema de una comunidad de propietarios que quiere
     * gestionar las incidencias que se producen en la comunidad. Tendremos como propiedades: código, estado
     * (abierta, en proceso, resuelta), problema (la descripción de la incidencia), solución (la descripción de la solución),
     * pendientes (será una propiedad estática, cada vez que se crea un objeto se incrementa y cada vez que se
     * resuelve una se decrementa). Los métodos a implementar son:
     * - resuelve(): método estático que decrementa el contador de pendientes
     * - toString(): pasa un objeto a string, código, estado, problema y solución.
     * - getters y setters
     * - getPendientes(): método estático que devuelva el número de incidencias pendientes de resolver.
     * Realiza una clase TestIncidencia en la que crees 5 incidencias, resuelvas algunas y veas las que quedan
     * pendientes.
     */

    enum Estado {abierta, en_proceso, resuelta};
    private String codigo;
    private String problema;
    private String solucion;
    private static int pendientes = 0;
    private static Estado estado;

    public Incidencia(String codigo, String problema, String solucion, Incidencia.Estado estado) {
        this.codigo = codigo;
        this.problema = problema;
        this.solucion = solucion;
        this.estado = estado;
        if (estado != Estado.resuelta){
            pendientes++;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public static Estado getEstado() {
        return estado;
    }

    public static void setEstado(Estado estado) {
        Incidencia.estado = estado;
    }

    public void resolver(){
        if (estado != Estado.resuelta){
            estado = Estado.resuelta;
            pendientes--;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
