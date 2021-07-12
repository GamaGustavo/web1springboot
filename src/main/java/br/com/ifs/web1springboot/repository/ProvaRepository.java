package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Prova;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvaRepository extends CrudRepository<Prova,Integer> {
}
