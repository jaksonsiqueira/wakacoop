package academy.wakanda.wakacoop.pauta.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
@Entity
public class Pauta {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = true,nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;
}
