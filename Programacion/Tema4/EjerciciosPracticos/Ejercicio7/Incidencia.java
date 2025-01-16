package Tema4.EjerciciosPracticos.Ejercicio7;

public class Incidencia {

    private String codigo;
    enum estado {abierto, en_prosuelta, resuelta};
    private String problema;
    private String solucion;
    private static Integer pendientes = 0;


    public Incidencia(String codigo, String problema, String solucion) {
        this.codigo = codigo;
        this.problema = problema;
        this.solucion = solucion;
        Incidencia.pendientes++;
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

    public static Integer getPendientes() {
        return pendientes;
    }

    public static void setPendientes(Integer pendientes) {
        Incidencia.pendientes = pendientes;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }






}
