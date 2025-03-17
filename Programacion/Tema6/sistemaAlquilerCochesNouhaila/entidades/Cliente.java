package Tema6.sistemaAlquilerCochesNouhaila.entidades;

import java.time.LocalDate;

public class Cliente extends Persona{

    /**
     * Atributos
     */
    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;



    /**
     * Constructor
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param email
     * @param direccion
     * @param telefono
     */
    public Cliente(String nombre, String apellidos, String dni, String email,
                   String direccion, String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.fechaObtencionLicencia = fechaObtencionLicencia;
        this.licenciaConducir = licenciaConducir;

    }

    /**
     * Constructor Copia
     */
    public Cliente(Cliente otra){
        super(otra.nombre, otra.apellidos, otra.dni, otra.email, otra.direccion, otra.telefono);
        this.fechaObtencionLicencia = otra.fechaObtencionLicencia;
        this.apellidos = otra.licenciaConducir;
    }

    /**
     * Getter Setter
     */
    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLicencia=").append(fechaObtencionLicencia);
        sb.append('}');
        return sb.toString();
    }
}
