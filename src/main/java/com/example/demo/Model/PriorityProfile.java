package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class PriorityProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "priorityProfile_generator")
    @SequenceGenerator(name = "priorityProfile_generator", sequenceName = "priorityProfile_seq")
    private long id;
    private Integer value;
    private long benefitId;
    private long jobseekerId;

    public PriorityProfile() {

    }

    public PriorityProfile(long benefit_id, long id, long jobseeker_id, Integer value) {
        this.id = id;
        this.value = value;
        this.benefitId = benefit_id;
        this.jobseekerId = jobseeker_id;
    }
}
