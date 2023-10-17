package academy.wakanda.wakacoop.pauta.application.service;

import academy.wakanda.wakacoop.pauta.application.api.NovaPautaRequest;
import academy.wakanda.wakacoop.pauta.application.api.PautaCadastroResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    @Override
    public PautaCadastroResponse cadastraPauta(NovaPautaRequest novaPauta){
        log.info("[inicia] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}",novaPauta);
        log.info("[Finaliza] PautaApplicationService - cadastraPauta");
        return null;
    }

}
