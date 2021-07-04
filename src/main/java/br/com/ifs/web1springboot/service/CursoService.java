package br.com.ifs.web1springboot.service;

import br.com.ifs.web1springboot.model.Curso;
import br.com.ifs.web1springboot.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public void cadastrar(Curso curso) throws Exception{
        if (curso == null) {
            throw new Exception("Curso nulo!");
        }
        cursoRepository.save(curso);

    }
    public List<Curso> getAll() {
        return (List<Curso>)cursoRepository.findAll();
    }
}
