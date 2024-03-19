package com.elis.aeroportoprivato.service.impl;

import com.elis.aeroportoprivato.model.Passeggero;
import com.elis.aeroportoprivato.model.Prenotazione;
import com.elis.aeroportoprivato.model.Volo;
import com.elis.aeroportoprivato.repository.PrenotazioneRepo;
import com.elis.aeroportoprivato.service.def.PrenotazioneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PrenotazioneServiceJpa implements PrenotazioneService {
    private final PrenotazioneRepo repo;

    @Override
    public Optional<Prenotazione> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void salva(Prenotazione prenotazione) {
        repo.save(prenotazione);
    }

    @Override
    public List<Passeggero> findPasseggeriByPrenotazione(Prenotazione prenotazione) {
        return prenotazione.getPasseggeri();
    }

    @Override
    public List<Prenotazione> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Volo> findVoliByPrenotazione(Prenotazione prenotazione) {
        return prenotazione.getVoli();
    }
}
