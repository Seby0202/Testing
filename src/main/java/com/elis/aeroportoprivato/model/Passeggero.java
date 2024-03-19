package com.elis.aeroportoprivato.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "passeggeri")
public class Passeggero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cognome;	
	
	@Column(nullable = false)
	private LocalDate dataNascita;
	
	@Column(nullable = false, length = 20)
	private String tipologiaDocumento;
	
	@Column(nullable = false)
	private String numeroDocumento;

	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean rimosso;

}
