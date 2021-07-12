package br.com.ifs.web1springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "price")
public class Price {

    @Id
    @Column
    private String symbol;

    @Column
    private String price;
}
