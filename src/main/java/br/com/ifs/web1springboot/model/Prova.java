package br.com.ifs.web1springboot.model;

import br.com.ifs.web1springboot.model.Avaliacao;
import br.com.ifs.web1springboot.model.Disciplina;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "prova")
public class Prova {
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String descricao;

    @OneToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm", timezone = "America/Maceio")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "id_avaliacao")
    private Avaliacao avaliacao;
}
