package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepo extends JpaRepository<Prenotazione,Long> {
}
