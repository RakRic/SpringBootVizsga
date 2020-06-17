package com.example.demo.Repository;

import com.example.demo.Model.PriorityProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityProfileRepository extends CrudRepository<PriorityProfile, Long> {
}
