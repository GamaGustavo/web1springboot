package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Disciplina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends CrudRepository<Disciplina,Integer> {
}
