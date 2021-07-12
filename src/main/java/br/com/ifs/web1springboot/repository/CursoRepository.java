package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
