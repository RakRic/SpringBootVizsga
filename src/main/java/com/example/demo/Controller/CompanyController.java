package com.example.demo.Controller;

import com.example.demo.Model.Company;
import com.example.demo.Service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    // Create
    @PostMapping(path = "/createCompany")
    public Company create(@RequestBody Company company){
        return this.companyService.create(company);
    }

    // Read
    @GetMapping(path = "/companies")
    public List<Company> getAll(){
        return companyService.getAll();
    }

    // Update
    @PostMapping(path = "/updateCompany")
    public Company update(@RequestBody Company company ){
        return companyService.update(company);
    }

    // Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/company/{id}")
    public void delete(@PathVariable("id")Long id){
        companyService.delete(id);
    }

    // getBenefitsByCompanyId
    @GetMapping(path = "/company/{id}/benefits")
    public List<String> getBenefitsByCompanyId(@PathVariable("id")Long id) {return companyService.getBenefitsByCompanyId(id);}

    //getCompanyById
    @RequestMapping(method = RequestMethod.GET, value = "/company/{id}")
    public Company findById(@PathVariable("id")Long id) {
        return companyService.getCompanyById(id);
    }
}
