package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Aereoporto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AereoportoRepo extends JpaRepository<Aereoporto, Long> {
    List<Aereoporto> findAllByNazione(String nazione);
    List<Aereoporto> findAllByCitta(String citta);
}
