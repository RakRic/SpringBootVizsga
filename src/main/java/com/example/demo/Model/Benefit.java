package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "benefit_generator")
    @SequenceGenerator(name = "benefit_generator", sequenceName = "benefit_seq")
    private long id;
    private String name;
}
