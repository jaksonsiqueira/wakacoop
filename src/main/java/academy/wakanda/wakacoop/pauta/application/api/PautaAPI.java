package academy.wakanda.wakacoop.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    PautaCadastroResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);

}
