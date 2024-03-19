package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Aereoporto;

import java.util.List;
import java.util.Optional;

public interface AereoportoService {
    Optional<Aereoporto> findById(long id);
    List<Aereoporto> findAeroportiByNazione(String nazione);
    List<Aereoporto> findAeroportiByCitta(String citta);
    void salva(Aereoporto aereoporto);
    List<Aereoporto> findAll();
}
