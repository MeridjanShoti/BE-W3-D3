package it.epicode.classi.main;

import it.epicode.classi.DAO.LocationDAO;
import it.epicode.classi.DAO.PartecipazioneDAO;
import it.epicode.classi.DAO.PersonaDAO;
import it.epicode.classi.Evento;
import it.epicode.classi.DAO.EventoDAO;
import it.epicode.classi.Location;
import it.epicode.classi.Partecipazione;
import it.epicode.classi.Persona;
import it.epicode.classi.enums.Sesso;
import it.epicode.classi.enums.Stato;
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
        PersonaDAO personaDao = new PersonaDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);

        Location location1 = new Location("Stadio", "Roma");
        Location location2 = new Location("Teatro", "Milano");
        Evento evento1 = new Evento("80 Voglia Disco Party", LocalDate.of(2025, 5, 12), "Revival Disco anni 80", TipoEvento.PUBBLICO, 53);
        Evento evento2 = new Evento("Sagra della salsiccia", LocalDate.of(2025, 4, 25), "Festa patronale della salsiccia di Zagarolo", TipoEvento.PUBBLICO, 63);
        Evento evento3 = new Evento("Raduno soffiatori di minestrine", LocalDate.of(2025, 6, 21), "30esimo raduno di uomini sottovalutati con polmoni d'acciaio", TipoEvento.PRIVATO, 22 );
        Evento evento4 = new Evento("Resurrezione di Papa Francesco", LocalDate.of(2025, 5, 4), "Ci seppellirà tutti quanti", TipoEvento.PRIVATO, 23);

        evento1.setLocation(location1);
        evento2.setLocation(location2);
        evento3.setLocation(location2);
        evento4.setLocation(location1);

        Persona persona1 = new Persona("Gianni", "Cunulengo", "giannicunulengo@giannimail.it", LocalDate.of(1991, 11, 15), Sesso.M);
        Persona persona2 = new Persona("Mario", "Sburroni", "mariosburroni@gmail.com", LocalDate.of(1984, 5, 23), Sesso.M);
        Persona persona3 = new Persona("Giovanna", "Rossi", "giovannarossi@hotmail.it", LocalDate.of(1995, 1, 12), Sesso.F);
        Persona persona4 = new Persona("Giulia", "Bianchi", "giuliabianchi@gmail.com", LocalDate.of(1989, 7, 4), Sesso.F);
        Persona persona5 = new Persona("Luca", "Verdi", "lucaverdi@yahoo.it", LocalDate.of(1992, 3, 20), Sesso.M);
        Persona persona6 = new Persona("Anna", "Neri", "annaneri@gmail.it", LocalDate.of(1997, 9, 8), Sesso.F);
        Persona persona7 = new Persona("Marco", "Gialli", "marcogialli@gmail.com", LocalDate.of(1986, 12, 30), Sesso.M);
        Persona persona8 = new Persona("Sara", "Marroni", "saretta93@outlook.it", LocalDate.of(1993, 6, 17), Sesso.F);
        Persona persona9 = new Persona("Paolo", "Blu", "paoloblu@gmail.com", LocalDate.of(1988, 4, 25), Sesso.M);
        Persona persona10 = new Persona("Laura", "Rosa", "laurarosa@gmail.com", LocalDate.of(1996, 2, 14), Sesso.F);






        Partecipazione partecipazione1 = new Partecipazione(persona2, Stato.CONFERMATO, evento1);
        Partecipazione partecipazione2 = new Partecipazione(persona3, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione3 = new Partecipazione(persona4, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione4 = new Partecipazione(persona5, Stato.DA_CONFERMARE, evento4);
        Partecipazione partecipazione5 = new Partecipazione(persona6, Stato.CONFERMATO, evento1);
        Partecipazione partecipazione6 = new Partecipazione(persona7, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione7 = new Partecipazione(persona8, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione8 = new Partecipazione(persona9, Stato.DA_CONFERMARE, evento4);
        Partecipazione partecipazione9 = new Partecipazione(persona10, Stato.CONFERMATO, evento1);
        Partecipazione partecipazione10 = new Partecipazione(persona1, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione11 = new Partecipazione(persona2, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione12 = new Partecipazione(persona3, Stato.CONFERMATO, evento4);
        Partecipazione partecipazione13 = new Partecipazione(persona4, Stato.DA_CONFERMARE, evento1);
        Partecipazione partecipazione14 = new Partecipazione(persona5, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione15 = new Partecipazione(persona6, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione16 = new Partecipazione(persona7, Stato.CONFERMATO, evento4);
        Partecipazione partecipazione17 = new Partecipazione(persona8, Stato.CONFERMATO, evento1);
        Partecipazione partecipazione18 = new Partecipazione(persona9, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione19 = new Partecipazione(persona10, Stato.DA_CONFERMARE, evento3);
        Partecipazione partecipazione20 = new Partecipazione(persona1, Stato.CONFERMATO, evento4);
        Partecipazione partecipazione21 = new Partecipazione(persona2, Stato.DA_CONFERMARE, evento1);
        Partecipazione partecipazione22 = new Partecipazione(persona3, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione23 = new Partecipazione(persona4, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione24 = new Partecipazione(persona5, Stato.CONFERMATO, evento4);
        Partecipazione partecipazione25 = new Partecipazione(persona6, Stato.CONFERMATO, evento1);
        Partecipazione partecipazione26 = new Partecipazione(persona7, Stato.CONFERMATO, evento2);
        Partecipazione partecipazione27 = new Partecipazione(persona8, Stato.CONFERMATO, evento3);
        Partecipazione partecipazione28 = new Partecipazione(persona9, Stato.CONFERMATO, evento4);

        locationDao.save(location1);
        locationDao.save(location2);

        eventoDao.save(evento1);
        eventoDao.save(evento2);
        eventoDao.save(evento3);
        eventoDao.save(evento4);

        personaDao.save(persona1);
        personaDao.save(persona2);
        personaDao.save(persona3);
        personaDao.save(persona4);
        personaDao.save(persona5);
        personaDao.save(persona6);
        personaDao.save(persona7);
        personaDao.save(persona8);
        personaDao.save(persona9);
        personaDao.save(persona10);

        partecipazioneDao.save(partecipazione1);
        partecipazioneDao.save(partecipazione2);
        partecipazioneDao.save(partecipazione3);
        partecipazioneDao.save(partecipazione4);
        partecipazioneDao.save(partecipazione5);
        partecipazioneDao.save(partecipazione6);
        partecipazioneDao.save(partecipazione7);
        partecipazioneDao.save(partecipazione8);
        partecipazioneDao.save(partecipazione9);
        partecipazioneDao.save(partecipazione10);
        partecipazioneDao.save(partecipazione11);
        partecipazioneDao.save(partecipazione12);
        partecipazioneDao.save(partecipazione13);
        partecipazioneDao.save(partecipazione14);
        partecipazioneDao.save(partecipazione15);
        partecipazioneDao.save(partecipazione16);
        partecipazioneDao.save(partecipazione17);
        partecipazioneDao.save(partecipazione18);
        partecipazioneDao.save(partecipazione19);
        partecipazioneDao.save(partecipazione20);
        partecipazioneDao.save(partecipazione21);
        partecipazioneDao.save(partecipazione22);
        partecipazioneDao.save(partecipazione23);
        partecipazioneDao.save(partecipazione24);
        partecipazioneDao.save(partecipazione25);
        partecipazioneDao.save(partecipazione26);
        partecipazioneDao.save(partecipazione27);



        em.close();
        emf.close();
    }
}
