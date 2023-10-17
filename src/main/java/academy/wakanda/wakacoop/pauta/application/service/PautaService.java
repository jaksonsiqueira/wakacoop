package academy.wakanda.wakacoop.pauta.application.service;

import academy.wakanda.wakacoop.pauta.application.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.application.api.PautaCadastroResponse;

public interface PautaService {
    PautaCadastroResponse cadastraPauta(NovaPautaRequest novaPauta);
}
