package com.elis.aeroportoprivato.service.impl;

import com.elis.aeroportoprivato.model.Passeggero;
import com.elis.aeroportoprivato.repository.PasseggeroRepo;
import com.elis.aeroportoprivato.service.def.PasseggeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaseggeroServiceJpa implements PasseggeroService {
    private final PasseggeroRepo repo;

    @Override
    public Optional<Passeggero> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void salva(Passeggero passeggero) {
        repo.save(passeggero);
    }

    @Override
    public List<Passeggero> findAll() {
        return repo.findAll();
    }
}
