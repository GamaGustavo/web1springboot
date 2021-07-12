package br.com.ifs.web1springboot.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table
public class Curso {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String nome;

   @OneToMany(mappedBy = "curso")
    private Set<Aluno> alunos;

   @OneToMany(mappedBy = "curso")
   private Set<Disciplina> disciplinas;
}
