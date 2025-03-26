package it.epicode.classi.DAO;

import it.epicode.classi.Persona;
import jakarta.persistence.EntityManager;

public class PersonaDAO {
    private EntityManager em;
    public PersonaDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Persona persona) {
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
    }
    public void update(Persona persona) {
        em.getTransaction().begin();
        em.merge(persona);
        em.getTransaction().commit();
    }
    public void delete(Persona persona) {
        em.getTransaction().begin();
        em.remove(persona);
        em.getTransaction().commit();
    }
    public Persona getById(long id) {
        return em.find(Persona.class, id);
    }
    public void saveNoTx(Persona persona) {
        em.persist(persona);
    }
    public void updateNoTx(Persona persona) {
        em.merge(persona);
    }
    public void deleteNoTx(Persona persona) {
        em.remove(persona);
    }
}
