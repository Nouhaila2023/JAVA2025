package Tema7_1.practica1.expedientesAlumnos;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {
    /**
     * Atributos
     */
    private TreeSet<Expediente> expediente;
    private String nombreCentro;
    private String direccion;
    private String localidad;
    private String telefono;
    private String email;

    /**
     * Constructor
     */
    public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
        this.expediente = new TreeSet<>(
                new Comparator<Expediente>() {
                    @Override
                    public int compare(Expediente o1, Expediente o2) {
                        return o1.getEstudiante().getDni().compareTo(o2.getEstudiante().getDni());
                    }
                }

        );
        this.nombreCentro = nombreCentro;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * addExpediente: prea añadir un expediente
     */
    public void addExpediente(Expediente e) {
        if (!expediente.contains(e)) {
            this.expediente.add(e);
        }
    }

    /**
     * buscarExpediente: que devolvera todas las notas de todos los cursos
     * de ese alumno
     */
    public void buscarExpediente(String dni) {
        for (Expediente e : expediente) {
            if (e.getEstudiante().getDni().equals(dni)) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Expediente no encontrado.");
    }



    /**
     * Getter Setter
     */
    public TreeSet<Expediente> getExpediente() {
        return expediente;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public CentroEducativo setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public CentroEducativo setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public CentroEducativo setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public CentroEducativo setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CentroEducativo setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * toStinrg
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CentroEducativo{");
        sb.append("expediente=").append(expediente);
        sb.append(", nombreCentro='").append(nombreCentro).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals con nombre del centro
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return Objects.equals(nombreCentro, that.nombreCentro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreCentro);
    }
}
