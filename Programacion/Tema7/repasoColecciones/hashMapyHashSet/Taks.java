package Tema7.repasoColecciones.hashMapyHashSet;

public class Taks {

    private String descripcion;
    private State state;

    public Taks(String descripcion, State state) {
        this.descripcion = descripcion;
        this.state = state;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Taks{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
