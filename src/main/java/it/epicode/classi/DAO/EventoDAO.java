package it.epicode.classi.DAO;

import it.epicode.classi.Evento;
import jakarta.persistence.EntityManager;

public class EventoDAO {
    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }
    public void update(Evento evento) {
        em.getTransaction().begin();
        em.merge(evento);
        em.getTransaction().commit();
    }
    public void delete(Evento evento) {
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();
    }
    public Evento getById(long id) {
        return em.find(Evento.class, id);
    }
    public void saveNoTx(Evento evento) {
        em.persist(evento);
    }
    public void updateNoTx(Evento evento) {
        em.merge(evento);
    }
    public void deleteNoTx(Evento evento) {
        em.remove(evento);
    }
}
