package com.elis.aeroportoprivato.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_aereo", nullable = false)
	private Aereo aereo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prenotazione")
    private List<Volo> voli;
    
	@ManyToMany
	@JoinTable(name = "prenotazioni_passeggeri",
		joinColumns = @JoinColumn(name = "id_prenotazione"),
		inverseJoinColumns = @JoinColumn(name = "id_passeggero"))
    private List<Passeggero> passeggeri;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_utente", nullable = false)
    private Utente utente;
    
	@ManyToMany
	@JoinTable(name = "turni",
		joinColumns = @JoinColumn(name = "id_prenotazione"),
		inverseJoinColumns = @JoinColumn(name = "id_dipendente"))
    private List<Utente> dipendenti;

	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean rimosso;

}
