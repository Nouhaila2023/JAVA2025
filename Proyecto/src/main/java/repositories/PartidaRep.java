package repositories;

import entities.Partida;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class PartidaRep {
    private Session session;

    public PartidaRep() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Partida partida) {
        session.beginTransaction();
        session.persist(partida);
        session.getTransaction().commit();
    }

    public void update(Partida partida) {
        session.beginTransaction();
        session.merge(partida);
        session.getTransaction().commit();
    }

    public void delete(Partida partida) {
        session.beginTransaction();
        session.remove(partida);
        session.getTransaction().commit();
    }

    public Partida findById(Long id) {
        return session.find(Partida.class, id);
    }

    public List<Partida> findAll() {
        return session.createQuery("SELECT p FROM Partida p", Partida.class)
                .getResultList();
    }

    public void close() {
        session.close();
    }
}
