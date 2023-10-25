package academy.wakanda.wakacoop.pauta.application.service;

import academy.wakanda.wakacoop.pauta.application.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
