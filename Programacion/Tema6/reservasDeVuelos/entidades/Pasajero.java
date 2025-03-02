package Tema6.reservasDeVuelos.entidades;

public class Pasajero extends Persona {

    /**
     * Añade Atributos
     */
    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    /**
     * Constructor con todos los parametros
     */
    public Pasajero(Long id, String nombre, String apellido, String dniPasaporte, String email, String direccion, String ciudad, String pais, String telefono, String preferenciasComida, String restriccionesMedicas, Asiento asiento) {
        super(id, nombre, apellido, dniPasaporte, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    /**
     * Constructor copia
     */
    public Pasajero(Pasajero otro) {
        this.preferenciasComida = otro.preferenciasComida;
        this.restriccionesMedicas = otro.restriccionesMedicas;
        this.asiento = otro.asiento;
    }

    /**
     * Getter Setter
     */
    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public Pasajero setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
        return this;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public Pasajero setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
        return this;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Pasajero setAsiento(Asiento asiento) {
        this.asiento = asiento;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }

}

