package com.elis.aeroportoprivato.service.def;

import com.elis.aeroportoprivato.model.Passeggero;
import com.elis.aeroportoprivato.model.Prenotazione;
import com.elis.aeroportoprivato.model.Volo;

import java.util.List;
import java.util.Optional;

public interface PrenotazioneService {
    Optional<Prenotazione> findById(long id);
    void salva(Prenotazione prenotazione);
    List<Passeggero> findPasseggeriByPrenotazione(Prenotazione prenotazione);
    List<Prenotazione> findAll();
    List<Volo> findVoliByPrenotazione(Prenotazione prenotazione);
}
