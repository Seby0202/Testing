package com.elis.aeroportoprivato.dto.request;

import java.util.List;

public class AggiuntaPrenotazione {
    private String aereo;
    private List<AggiuntaVoloDTO> destinazione;
    private int numeroPasseggeri;
}
