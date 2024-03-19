package com.elis.aeroportoprivato.service.impl;

import com.elis.aeroportoprivato.model.Aereo;
import com.elis.aeroportoprivato.repository.AereoRepo;
import com.elis.aeroportoprivato.service.def.AereoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AereoServiceJpa implements AereoService {
    private final AereoRepo repo;

    @Override
    public Optional<Aereo> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void salva(Aereo aereo) {
        repo.save(aereo);
    }

    @Override
    public List<Aereo> findAll() {
        return repo.findAll();
    }
}
