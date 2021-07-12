package br.com.ifs.web1springboot.service;

import br.com.ifs.web1springboot.model.Aluno;
import br.com.ifs.web1springboot.model.Avaliacao;
import br.com.ifs.web1springboot.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;
    public void cadastrar(Avaliacao avaliacao) throws Exception{
        if (avaliacao == null) {
            throw new Exception("Aluno nulo!");
        }
        avaliacaoRepository.save(avaliacao);

    }
    public List<Avaliacao> getAll() {
        return (List<Avaliacao>)avaliacaoRepository.findAll();
    }
}
