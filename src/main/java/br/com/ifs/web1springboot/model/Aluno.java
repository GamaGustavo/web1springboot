package br.com.ifs.web1springboot.model;


import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String nome;

    @Column
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @ManyToMany(mappedBy = "alunos")
    private Set<Disciplina> disciplinas;

    @OneToOne(mappedBy = "aluno")
    private  Avaliacao avaliacao;

}
