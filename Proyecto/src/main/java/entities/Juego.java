package entities;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "juegos")

public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String plataforma;
    private int pegi;

    public enum Categoria {
        juego1, juego2, juego3, DEPOjuego4
    }

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL)
    private List<Partida> partidas = new ArrayList<>();

    public Juego(Long id, String nombre, String plataforma, int pegi, Categoria categoria, List<Partida> partidas) {
        this.id = id;
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.pegi = pegi;
        this.categoria = categoria;
        this.partidas = partidas;
    }

    public Juego() {
    }

    public Long getId() {
        return id;
    }

    public Juego setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Juego setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Juego setPlataforma(String plataforma) {
        this.plataforma = plataforma;
        return this;
    }

    public int getPegi() {
        return pegi;
    }

    public Juego setPegi(int pegi) {
        this.pegi = pegi;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Juego setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public Juego setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Juego{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", plataforma='").append(plataforma).append('\'');
        sb.append(", pegi=").append(pegi);
        sb.append(", categoria=").append(categoria);
        sb.append(", partidas=").append(partidas);
        sb.append('}');
        return sb.toString();
    }
}
