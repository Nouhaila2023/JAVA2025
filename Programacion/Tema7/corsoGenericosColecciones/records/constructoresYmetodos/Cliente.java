package Tema7.corsoGenericosColecciones.records.constructoresYmetodos;

import java.util.Objects;

public record Cliente(String nombre, String apellido, String correo) {
    public Cliente{

        //si queremos el algo de los atributos no son null usamos:
        //Obligatorio que pasamos algo al nombre y el apellido si no va estar un error
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(apellido);

    }

    //toLowerCase para poner las letras en menuscula
    public Cliente(String nombre, String apellido){
        this(nombre,apellido, nombre.toLowerCase() + "_" + apellido.toLowerCase() + "@gmail.com");
    }

    public String nombreCompleto(){
        return this.nombre + " " + this.apellido;
    }


}
