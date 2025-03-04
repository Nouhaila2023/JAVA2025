package Tema6.ejercicioClasePoo_2ev.entidades;

import jdk.jshell.spi.SPIResolutionException;

public class Cliente {
    /**
     * Atributos
     */
    private String dni;
    private String gmail;
    private String direccion;
    private String datosBancarios;


    /**
     * Constructor
     */
    public Cliente(String dni, String gmail, String direccion, String datosBancarios) {
        this.dni = dni;
        this.gmail = gmail;
        this.direccion = direccion;
        this.datosBancarios = datosBancarios;
    }


    /**
     * Getter Setter
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(String datosBancarios) {
        this.datosBancarios = datosBancarios;
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", gmail='").append(gmail).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", datosBancarios='").append(datosBancarios).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
