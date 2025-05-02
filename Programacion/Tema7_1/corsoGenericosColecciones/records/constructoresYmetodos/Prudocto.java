package Tema7_1.corsoGenericosColecciones.records.constructoresYmetodos;

public record Prudocto(Long codigo, String nombre, double precio) {

    public Prudocto(Long codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}
