package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "programmingLanguage_generator")
    @SequenceGenerator(name = "programmingLanguage_generator", sequenceName = "programmingLanguage_seq")
    private long id;
    private String name;
    private Integer experience;
    private long jobseekerId;


}
