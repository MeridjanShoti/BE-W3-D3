package it.epicode.classi.DAO;

import it.epicode.classi.Partecipazione;
import jakarta.persistence.EntityManager;

public class PartecipazioneDAO {
    private EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();
    }
    public void update(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.merge(partecipazione);
        em.getTransaction().commit();
    }
    public void delete(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.remove(partecipazione);
        em.getTransaction().commit();
    }
    public Partecipazione getById(long id) {
        return em.find(Partecipazione.class, id);
    }
    public void saveNoTx(Partecipazione partecipazione) {
        em.persist(partecipazione);
    }
    public void updateNoTx(Partecipazione partecipazione) {
        em.merge(partecipazione);
    }
    public void deleteNoTx(Partecipazione partecipazione) {
        em.remove(partecipazione);
    }
}
