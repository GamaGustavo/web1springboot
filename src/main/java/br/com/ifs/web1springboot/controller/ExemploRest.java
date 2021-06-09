package br.com.ifs.web1springboot.controller;

import br.com.ifs.web1springboot.dto.Aluno_dto;
import br.com.ifs.web1springboot.model.Aluno;
import br.com.ifs.web1springboot.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exemplo")
public class ExemploRest {

    @Autowired
    private AlunoService alunoService;

    @RequestMapping(value = "/olamundo", method = RequestMethod.GET)
    public Object olamundo() {
        Aluno_dto aluno = new Aluno_dto();
        aluno.setMatricula("12312");
        aluno.setNome("George Leite");
        aluno.setFone("799999903939");
        aluno.setEndereco("Rua Beco dos cocos");
        return aluno;
    }

    @RequestMapping(value = "/novoAluno", method = RequestMethod.POST)
    public Object novoAluno(@RequestBody Aluno aluno) throws Exception {
        alunoService.cadastrar(aluno);
        return aluno;
    }

    @RequestMapping(value = "/novoAluno", method = RequestMethod.GET)
    public Object getAllAlunos() throws Exception {
        return alunoService.getAll();
    }

}
