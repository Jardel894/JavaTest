package br.com.sigabem.repository;

import br.com.sigabem.entity.Cotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotacaoRepository extends JpaRepository<Cotacao, Long> {

}
