package repositories;


import entities.Juego;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;
public class JuegoRep {

    private Session session;

    public JuegoRep() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Juego juego) {
        session.beginTransaction();
        session.persist(juego);
        session.getTransaction().commit();
    }

    public void update(Juego juego) {
        session.beginTransaction();
        session.merge(juego);
        session.getTransaction().commit();
    }

    public void delete(Juego juego) {
        session.beginTransaction();
        session.remove(juego);
        session.getTransaction().commit();
    }

    public Juego findById(Long id) {
        return session.find(Juego.class, id);
    }

    public List<Juego> findAll() {
        return session.createQuery("SELECT j FROM Juego j", Juego.class)
                .getResultList();
    }

    public void close() {
        session.close();
    }

}
