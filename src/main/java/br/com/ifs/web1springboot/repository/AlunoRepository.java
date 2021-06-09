package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Aluno;
import org.springframework.data.repository.CrudRepository;


public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
}
