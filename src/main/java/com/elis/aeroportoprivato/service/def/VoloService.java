package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Volo;

import java.util.List;
import java.util.Optional;

public interface VoloService {
    Optional<Volo> findById(long id);
    void salva(Volo volo);
    List<Volo> findAll();
}
