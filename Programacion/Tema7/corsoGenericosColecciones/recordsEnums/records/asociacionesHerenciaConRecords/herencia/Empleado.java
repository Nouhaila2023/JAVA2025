package Tema7.corsoGenericosColecciones.recordsEnums.records.asociacionesHerenciaConRecords.herencia;

import java.time.LocalDate;

public record Empleado(String nombre, String apellido, LocalDate fecha) implements Nombrabre {





    @Override
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
