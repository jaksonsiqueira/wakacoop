package academy.wakanda.wakacoop.pauta.application.api;

import academy.wakanda.wakacoop.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PautaController implements PautaAPI{
    private final PautaService pautaService;

    @Override
    public PautaCadastroResponse cadastraPauta(NovaPautaRequest novaPauta){
        log.info("[inicia] PautaControlle - cadastraPauta");
        PautaCadastroResponse pautaCadastrada = pautaService.cadastraPauta(novaPauta);
        log.info("[finaliza] PautaControlle - cadastraPauta");
        return pautaCadastrada;
    }
}
