package academy.wakanda.wakacoop.pauta.infra;

import academy.wakanda.wakacoop.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJPARepository extends JpaRepository<Pauta, UUID> {
}
