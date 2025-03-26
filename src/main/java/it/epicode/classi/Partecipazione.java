package it.epicode.classi;

import it.epicode.classi.enums.Stato;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    private long id;
    @ManyToOne
    private Persona persona;
    private Stato stato;
    @ManyToOne
    private Evento evento;

    public Partecipazione(Persona persona, Stato stato, Evento evento) {
        this.persona = persona;
        this.stato = stato;
        this.evento = evento;
    }
    public Partecipazione() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
