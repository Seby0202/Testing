package com.elis.aeroportoprivato.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "voli")
public class Volo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_destinazione", nullable = false)
	private Aereoporto destinazione;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_partenza", nullable = false)
    private Aereoporto partenza;
    
	@Column(name = "data_partenza", nullable = false)
    private LocalDate dataPartenza;
    
	@Column(name = "data_arrivo", nullable = false)
    private LocalDate dataArrivo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_prenotazione")
	private Prenotazione prenotazione;

}
