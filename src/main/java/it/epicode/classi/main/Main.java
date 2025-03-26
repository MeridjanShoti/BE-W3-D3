package it.epicode.classi.main;

import it.epicode.classi.Evento;
import it.epicode.classi.DAO.EventoDAO;
import it.epicode.classi.enums.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
        EntityManager em = emf.createEntityManager();
        EventoDAO eventoDao = new EventoDAO(em);
        Evento evento = new Evento("Evento 1", LocalDate.of(2023, 1, 15), "Descrizione 1", TipoEvento.PUBBLICO, 100);
        eventoDao.save(evento);
        Evento evento1 = new Evento("Evento 2", LocalDate.of(2023, 4, 23), "Descrizione 2", TipoEvento.PRIVATO, 50);
        eventoDao.save(evento1);
        Evento evento2 = new Evento("Evento ciao", LocalDate.of(2024, 7, 11), "Descrizione 3", TipoEvento.PUBBLICO, 70);
        eventoDao.save(evento2);
        Evento evento3 = new Evento("Evento 4", LocalDate.of(2023, 12, 9), "Descrizione 4", TipoEvento.PRIVATO, 80);
        eventoDao.save(evento3);

        em.close();
        emf.close();
    }
}
