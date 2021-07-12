package br.com.ifs.web1springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "avaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue
    @Column
    private int id;

    @OneToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @OneToMany(mappedBy = "avaliacao")
    private Set<Prova> provas;

    @Column
    private double nota;

    @Column
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", timezone = "America/Maceio")
    private Date data;
}
