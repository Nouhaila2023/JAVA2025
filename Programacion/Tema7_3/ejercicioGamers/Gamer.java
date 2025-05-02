package Tema7_3.ejercicioGamers;

import java.util.Objects;

public class Gamer {

    private String nick;
    private String email;
    private String juego;
    private Nivel nivel;


    public Gamer(String nick, String email, String juego, Nivel nivel) {
        this.nick = nick;
        this.email = email;
        this.juego = juego;
        this.nivel = nivel;
    }

    public String getNick() {
        return nick;
    }

    public Gamer setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Gamer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getJuego() {
        return juego;
    }

    public Gamer setJuego(String juego) {
        this.juego = juego;
        return this;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Gamer setNivel(Nivel nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gamer{");
        sb.append("Gamer='").append(nick).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", juego='").append(juego).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gamer gamer = (Gamer) o;
        return Objects.equals(nick, gamer.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nick);
    }
}
