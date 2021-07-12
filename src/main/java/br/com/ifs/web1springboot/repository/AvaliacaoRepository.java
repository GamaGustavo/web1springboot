package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Avaliacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends CrudRepository<Avaliacao,Integer> {
}
