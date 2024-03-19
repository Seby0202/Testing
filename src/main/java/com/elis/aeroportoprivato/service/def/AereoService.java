package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Aereo;

import java.util.List;
import java.util.Optional;

public interface AereoService {
    Optional<Aereo> findById(long id);
    void salva(Aereo aereo);
    List<Aereo> findAll();
}
