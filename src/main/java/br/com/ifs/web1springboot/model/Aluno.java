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


    @ManyToMany
    @JoinTable(
            name = "aluno_curso",
            joinColumns = @JoinColumn(name = "id_aluno"),
            inverseJoinColumns = @JoinColumn(name = "id_curso")
    )
    Set<Curso> cursoAlu;
}
