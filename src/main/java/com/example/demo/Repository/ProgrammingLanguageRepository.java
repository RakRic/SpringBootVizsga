package com.example.demo.Repository;

import com.example.demo.Model.ProgrammingLanguage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends CrudRepository<ProgrammingLanguage, Long> {
}
