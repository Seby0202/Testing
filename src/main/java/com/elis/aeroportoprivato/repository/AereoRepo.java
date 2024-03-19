package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Aereo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AereoRepo extends JpaRepository<Aereo, Long> {
}
