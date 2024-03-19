package com.elis.aeroportoprivato.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cognome;
	
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(nullable = false, length = 20)
	private String password;
	
	@Column(nullable = false)
	private Ruolo ruolo;
	
	@Column(name = "data_aggiunta", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP()")
	@CreationTimestamp
	private LocalDate dataAggiunta;
	
	@Column(name = "data_modifica", nullable = false, updatable = true, insertable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP()")
	@UpdateTimestamp
	private LocalDate dataModifica;
	
	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean rimosso;
	
	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazioni;
	
	@ManyToMany(mappedBy = "dipendenti")
	private List<Prenotazione> turni;

}
