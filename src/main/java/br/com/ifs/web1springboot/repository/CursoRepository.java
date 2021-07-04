package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
