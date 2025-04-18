package tema7_2.ejercicioClaseStreams.pedidos;

public class Cliente {
    private Long id;
    private String nombre;
    private Integer nivel;

    public Cliente(Long id, String nombre, Integer nivel) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public Cliente setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Cliente setNivel(Integer nivel) {
        this.nivel = nivel;
        return this;
    }
}
