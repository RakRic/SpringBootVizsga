package com.example.demo.Service;

import com.example.demo.Model.Company;
import com.example.demo.Repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    // Create
    public Company create(Company company){
        return companyRepository.save(company);
    }

    // Read
    public List<Company> getAll(){
        return (List<Company>) companyRepository.findAll();
    }

    // Update
    public Company update(Company company){
        return companyRepository.save(company);
    }

    // Delete
    public void delete(Long id){
        companyRepository.deleteById(id);
    }

    //getBenefitsByCompanyId
    public List<String> getBenefitsByCompanyId(Long id) {
        return companyRepository.getBenefitsByCompanyId(id);
    }

    //GetCompanyById
    public Company getCompanyById(Long id){
        Optional<Company> optionalCompany = companyRepository.findById(id);

        if(optionalCompany.isPresent()){
            return optionalCompany.get();
        } else {
            throw new IdNotFoundException("There is no Company by this id");
        }
    }
}
