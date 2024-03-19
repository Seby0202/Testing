package com.elis.aeroportoprivato.service.impl;


import com.elis.aeroportoprivato.model.Volo;
import com.elis.aeroportoprivato.repository.VoloRepo;
import com.elis.aeroportoprivato.service.def.VoloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VoloServiceJpa implements VoloService {
    private final VoloRepo repo;

    @Override
    public Optional<Volo> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void salva(Volo volo) {
        repo.save(volo);
    }

    @Override
    public List<Volo> findAll() {
        return repo.findAll();
    }
}
