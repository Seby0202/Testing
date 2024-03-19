package com.elis.aeroportoprivato.repository;

import com.elis.aeroportoprivato.model.Volo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoloRepo extends JpaRepository<Volo,Long> {
}
