package it.epicode.classi.DAO;

import it.epicode.classi.Location;
import jakarta.persistence.EntityManager;

public class LocationDAO {
    private EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location location) {
        em.getTransaction().begin();
        em.persist(location);
        em.getTransaction().commit();
    }

    public void update(Location location) {
        em.getTransaction().begin();
        em.merge(location);
        em.getTransaction().commit();
    }
    public void delete(Location location) {
        em.getTransaction().begin();
        em.remove(location);
        em.getTransaction().commit();
    }
    public Location getById(long id) {
        return em.find(Location.class, id);
    }
    public void saveNoTx(Location location) {
        em.persist(location);
    }
    public void updateNoTx(Location location) {
        em.merge(location);
    }
    public void deleteNoTx(Location location) {
        em.remove(location);
    }
}
