package br.com.ifs.web1springboot.controller;

import br.com.ifs.web1springboot.dto.AlunoDTO;
import br.com.ifs.web1springboot.model.Aluno;
import br.com.ifs.web1springboot.model.Avaliacao;
import br.com.ifs.web1springboot.model.Curso;
import br.com.ifs.web1springboot.model.Disciplina;
import br.com.ifs.web1springboot.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("faculdade")
public class FaculdadeController {
    @Autowired
    private AlunoService alunoService;
    @Autowired
    private CursoService cursoService;
    @Autowired
    private DisciplinaService disciplinaService;
    @Autowired
    private ProvaService provaService;
    @Autowired
    private AvaliacaoService avaliacaoService;

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

