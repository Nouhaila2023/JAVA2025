package Tema7.corsoGenericosColecciones.recordsEnums.records.asociacionesHerenciaConRecords.asociaciones;

import java.util.Arrays;

public record Empresa(String nombre, Empleado[] empleado) {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", empleado=").append(empleado == null ? "null" : Arrays.asList(empleado).toString());
        sb.append('}');
        return sb.toString();
    }
}
