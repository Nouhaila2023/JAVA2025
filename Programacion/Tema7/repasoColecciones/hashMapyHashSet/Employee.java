package Tema7.repasoColecciones.hashMapyHashSet;

public class Employee {
     private Integer id;
     private String nombre;
     private String email;
     private Deoartment deoartment;

    public Employee(Integer id, String nombre, String email, Deoartment deoartment) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.deoartment = deoartment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Deoartment getDeoartment() {
        return deoartment;
    }

    public void setDeoartment(Deoartment deoartment) {
        this.deoartment = deoartment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", deoartment=").append(deoartment);
        sb.append('}');
        return sb.toString();
    }
}
