package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class BenefitProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "benefitProfile_generator")
    @SequenceGenerator(name = "benefitProfile_generator", sequenceName = "benefitProfile_seq")
    private long id;
    private Boolean value;
    private long companyId;
    private long benefitId;
}
