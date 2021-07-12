package br.com.ifs.web1springboot.controller;

import br.com.ifs.web1springboot.dto.AlunoDTO;
import br.com.ifs.web1springboot.model.*;
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

    @RequestMapping(value = "/Aluno", method = RequestMethod.POST)
    public Object novoAluno(@RequestBody Aluno aluno) throws Exception {
        alunoService.cadastrar(aluno);
        return aluno;
    }
    @RequestMapping(value = "/Aluno", method = RequestMethod.GET)
    public Object getAllAlunos()  {
        return alunoService.getAll();
    }

    @RequestMapping(value = "/Curso", method = RequestMethod.POST)
    public Object novoCurso(@RequestBody Curso curso) throws Exception {
        cursoService.cadastrar(curso);
        return curso;
    }

    @RequestMapping(value = "/Curso", method = RequestMethod.GET)
    public Object getAllCursos()  {
        return cursoService.getAll();
    }
    @RequestMapping(value = "/Disciplina", method = RequestMethod.POST)
    public Object novaDisciplina(@RequestBody Disciplina disciplina) throws Exception {
        disciplinaService.cadastrar(disciplina);
        return disciplina;
    }

    @RequestMapping(value = "/Disciplina", method = RequestMethod.GET)
    public Object getAllDisciplinas()  {
        return disciplinaService.getAll();
    }
    @RequestMapping(value = "/Prova", method = RequestMethod.POST)
    public Object novaProva(@RequestBody Prova prova) throws Exception {
        provaService.cadastrar(prova);
        return prova;
    }

    @RequestMapping(value = "/Prova", method = RequestMethod.GET)
    public Object getAllProvas()  {
        return provaService.getAll();
    }
    @RequestMapping(value = "/Avaliacao", method = RequestMethod.POST)
    public Object novaAvaliacao(@RequestBody Avaliacao avaliacao) throws Exception {
        avaliacaoService.cadastrar(avaliacao);
        return avaliacao;
    }

    @RequestMapping(value = "/avaliacao", method = RequestMethod.GET)
    public Object getAllAvaliacoes()  {
        return avaliacaoService.getAll();
    }

}

