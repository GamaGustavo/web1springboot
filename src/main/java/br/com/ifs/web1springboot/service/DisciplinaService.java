package br.com.ifs.web1springboot.service;

import br.com.ifs.web1springboot.model.Curso;
import br.com.ifs.web1springboot.model.Disciplina;
import br.com.ifs.web1springboot.repository.CursoRepository;
import br.com.ifs.web1springboot.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public void cadastrar(Disciplina disciplina) throws Exception{
        if (disciplina == null) {
            throw new Exception("Curso nulo!");
        }
        disciplinaRepository.save(disciplina);

    }
    public List<Disciplina> getAll() {
        return (List<Disciplina>)disciplinaRepository.findAll();
    }
}
