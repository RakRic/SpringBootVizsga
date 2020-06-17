package com.example.demo.Controller;

import com.example.demo.Model.ProgrammingLanguage;
import com.example.demo.Service.ProgrammingLanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgrammingLanguageController {
    private final ProgrammingLanguageService programmingLanguageService;

    public  ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService){
        this.programmingLanguageService = programmingLanguageService;
    }

    // Create
    @PostMapping(path = "/createProgLanguage")
    public ProgrammingLanguage create(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.create(programmingLanguage);
    }

    // Read
    @GetMapping(path = "/progLanguages")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

    // Update
    @PostMapping(path = "/updateProgLanguage")
    public ProgrammingLanguage update(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.update(programmingLanguage);
    }

    // Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/progLanguage/{id}")
    public void delete(@PathVariable("id")Long id){
        programmingLanguageService.delete(id);
    }
}
