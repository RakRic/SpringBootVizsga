package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_generator")
    @SequenceGenerator(name = "company_generator", sequenceName = "company_seq")
    private long id;
    private String name;
    private String headQuarters;
    private String motto;
    private String homepage;
    private String description;
}
