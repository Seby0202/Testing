package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtenteRepo extends JpaRepository<Utente, Long> {
    Optional<Utente> findByEmail(String email);
}
