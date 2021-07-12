package br.com.ifs.web1springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String nome;

    @ManyToMany
    @JoinTable(name = "turma",
            joinColumns = @JoinColumn(name = "disc_id"),
            inverseJoinColumns = @JoinColumn(name = "id_aluno")
    )
    private Set<Aluno> alunos;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @OneToOne(mappedBy = "disciplina")
    private Prova prova;

    @OneToMany(mappedBy = "disciplina")
    private Set<Avaliacao> avaliacoes;
}
