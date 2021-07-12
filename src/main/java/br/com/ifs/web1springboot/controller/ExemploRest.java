package br.com.ifs.web1springboot.controller;

import br.com.ifs.web1springboot.model.dto.AlunoDTO;
import br.com.ifs.web1springboot.model.*;
import br.com.ifs.web1springboot.service.AlunoService;
import br.com.ifs.web1springboot.service.CursoService;
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
    @Autowired
    private CursoService cursoService;

    @RequestMapping(value = "/olamundo", method = RequestMethod.GET)
    public Object olamundo() {
        AlunoDTO aluno = new AlunoDTO();
        aluno.setMatricula("12312");
        aluno.setNome("George Leite");
        return aluno;
    }

    @RequestMapping(value = "/novoAluno", method = RequestMethod.POST)
    public Object novoAluno(@RequestBody Aluno aluno) throws Exception {
        alunoService.cadastrar(aluno);
        return aluno;
    }
    @RequestMapping(value = "/novoAluno", method = RequestMethod.GET)
    public Object getAllAlunos()  {
        return alunoService.getAll();
    }

    @RequestMapping(value = "/novoCurso", method = RequestMethod.POST)
    public Object novoCurso(@RequestBody Curso curso) throws Exception {
        cursoService.cadastrar(curso);
        return curso;
    }

    @RequestMapping(value = "/novoCurso", method = RequestMethod.GET)
    public Object getAllCursos()  {
        return cursoService.getAll();
    }

}
