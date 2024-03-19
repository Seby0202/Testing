package com.elis.aeroportoprivato.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "aereoporti")
public class Aereoporto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 20)
	private String continente;
	
	@Column(nullable = false, length = 20)
    private String nazione;
    
	@Column(nullable = false, length = 20)
    private String citta;
    
	@Column(nullable = false, length = 20)
    private String nome;
    
	@Column(nullable = false)
    private double prezzoSosta;

	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean rimosso;

}
