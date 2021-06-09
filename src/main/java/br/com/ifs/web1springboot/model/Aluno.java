package br.com.ifs.web1springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Aluno {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String nome;

    @Column
    private String matricula;

    @Column
    private String fone;

    @Column
    private String endereco;

}
