package br.com.ifs.web1springboot.service;

import br.com.ifs.web1springboot.model.Curso;
import br.com.ifs.web1springboot.model.Prova;
import br.com.ifs.web1springboot.repository.CursoRepository;
import br.com.ifs.web1springboot.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvaService {
    @Autowired
    private ProvaRepository provaRepository;

    public void cadastrar(Prova prova) throws Exception{
        if (prova == null) {
            throw new Exception("Curso nulo!");
        }
        provaRepository.save(prova);

    }
    public List<Prova> getAll() {
        return (List<Prova>)provaRepository.findAll();
    }
}
