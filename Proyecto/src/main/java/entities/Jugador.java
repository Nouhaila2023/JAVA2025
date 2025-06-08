package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addJugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String alias;
    private int edad;
    private String email;
    private String idioma;
    private String pais;

    @Lob
    private byte[] avatar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "juego_preferido_id")
    private Juego juegoPreferido;

    @ManyToMany(mappedBy = "jugadores")
    private List<Partida> partidas = new ArrayList<>();

    public Jugador() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public byte[] getAvatar() { return avatar; }
    public void setAvatar(byte[] avatar) { this.avatar = avatar; }
    public Juego getJuegoPreferido() { return juegoPreferido; }
    public void setJuegoPreferido(Juego juegoPreferido) { this.juegoPreferido = juegoPreferido; }
    public List<Partida> getPartidas() { return partidas; }
    public void setPartidas(List<Partida> partidas) { this.partidas = partidas; }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", idioma='").append(idioma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
