package br.com.ifs.web1springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "binance")
public class Binance {
    @Column
    private String timezone;
    @Id
    @Column
    private float serverTime;

}
