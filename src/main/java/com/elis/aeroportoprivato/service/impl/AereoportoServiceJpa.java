package com.elis.aeroportoprivato.service.impl;

import com.elis.aeroportoprivato.model.Aereoporto;
import com.elis.aeroportoprivato.repository.AereoportoRepo;
import com.elis.aeroportoprivato.service.def.AereoportoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AereoportoServiceJpa implements AereoportoService {
    private final AereoportoRepo repo;

    @Override
    public Optional<Aereoporto> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<Aereoporto> findAeroportiByNazione(String nazione) {
        return repo.findAllByNazione(nazione);
    }

    @Override
    public List<Aereoporto> findAeroportiByCitta(String citta) {
        return repo.findAllByCitta(citta);
    }

    @Override
    public void salva(Aereoporto aereoporto) {
        repo.save(aereoporto);
    }

    @Override
    public List<Aereoporto> findAll() {
        return repo.findAll();
    }
}
