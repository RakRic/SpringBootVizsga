package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jobSeeker_generator")
    @SequenceGenerator(name = "jobSeeker_generator", sequenceName = "jobSeeker_seq")
    private long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String country;
    private String phoneNumber;
    private String description;
}
