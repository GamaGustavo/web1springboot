package br.com.ifs.web1springboot.service;

import br.com.ifs.web1springboot.model.Aluno;
import br.com.ifs.web1springboot.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void cadastrar(Aluno aluno) throws Exception{
        if (aluno == null) {
            throw new Exception("Aluno nulo!");
        }
        alunoRepository.save(aluno);
    }
    public List<Aluno> getAll() {
        return (List<Aluno>)alunoRepository.findAll();
    }
}
