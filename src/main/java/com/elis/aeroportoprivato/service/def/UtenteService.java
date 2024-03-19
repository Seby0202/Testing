package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Utente;

import java.util.List;
import java.util.Optional;

public interface UtenteService {
    Optional<Utente> findById(long id);
    Optional<Utente> findByEmail(String email);
    //Optional login with password
    void salva(Utente utente);
    List<Utente> findAll();
}
