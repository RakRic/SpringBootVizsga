package com.example.demo.Service;

import com.example.demo.Model.ProgrammingLanguage;
import com.example.demo.Repository.ProgrammingLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageService {
    public final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageService(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    // Create
    public ProgrammingLanguage create(ProgrammingLanguage programmingLanguage){
        return programmingLanguageRepository.save(programmingLanguage);
    }

    // Read
    public List<ProgrammingLanguage> getAll(){
        return (List<ProgrammingLanguage>) programmingLanguageRepository.findAll();
    }

    // Update
    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage){
        return programmingLanguageRepository.save(programmingLanguage);
    }

    // Delete
    public void delete(Long id){
        programmingLanguageRepository.deleteById(id);
    }
}
