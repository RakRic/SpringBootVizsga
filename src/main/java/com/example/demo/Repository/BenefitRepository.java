package com.example.demo.Repository;

import com.example.demo.Model.Benefit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRepository extends CrudRepository<Benefit, Long> {
}
