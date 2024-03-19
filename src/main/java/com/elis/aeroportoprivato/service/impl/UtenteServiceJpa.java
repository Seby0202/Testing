package com.elis.aeroportoprivato.service.impl;

import com.elis.aeroportoprivato.model.Utente;
import com.elis.aeroportoprivato.repository.UtenteRepo;
import com.elis.aeroportoprivato.service.def.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtenteServiceJpa implements UtenteService {
    private final UtenteRepo repo;

    @Override
    public Optional<Utente> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Utente> findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public void salva(Utente utente) {
        repo.save(utente);
    }

    @Override
    public List<Utente> findAll() {
        return repo.findAll();
    }
}
