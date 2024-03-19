package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Passeggero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasseggeroRepo extends JpaRepository<Passeggero, Long> {
}
