package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Passeggero;

import java.util.List;
import java.util.Optional;

public interface PasseggeroService {
    Optional<Passeggero> findById(long id);
    void salva(Passeggero passeggero);
    List<Passeggero> findAll();
}
