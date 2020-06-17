package com.example.demo.Repository;

import com.example.demo.Model.BenefitProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitProfileRepository extends CrudRepository<BenefitProfile, Long> {
}
