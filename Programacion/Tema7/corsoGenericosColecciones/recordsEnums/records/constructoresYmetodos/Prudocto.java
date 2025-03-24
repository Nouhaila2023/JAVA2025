package Tema7.corsoGenericosColecciones.recordsEnums.records.constructoresYmetodos;

public record Prudocto(Long codigo, String nombre, double precio) {

    public Prudocto(Long codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}
