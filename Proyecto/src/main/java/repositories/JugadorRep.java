package repositories;

import entities.Jugador;
import org.hibernate.Session;
import utils.HibernateUtil;


import java.util.List;

public class JugadorRep {

    private Session session;

    public JugadorRep() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Jugador jugador) {
        session.beginTransaction();
        session.persist(jugador);
        session.getTransaction().commit();
    }

    public void update(Jugador jugador) {
        session.beginTransaction();
        session.merge(jugador);
        session.getTransaction().commit();
    }

    public void delete(Jugador jugador) {
        session.beginTransaction();
        session.remove(jugador);
        session.getTransaction().commit();
    }

    public Jugador findById(Long id) {
        return session.find(Jugador.class, id);
    }

    public static List<Jugador> findAll() {
        return session.createQuery("SELECT j FROM Jugador j", Jugador.class)
                .getResultList();
    }

    public void close() {
        session.close();
    }


}
