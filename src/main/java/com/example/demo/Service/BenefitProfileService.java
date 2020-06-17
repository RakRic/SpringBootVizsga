package com.example.demo.Service;

import com.example.demo.Model.BenefitProfile;
import com.example.demo.Repository.BenefitProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitProfileService {
    private  final BenefitProfileRepository benefitProfileRepository;

    public BenefitProfileService(BenefitProfileRepository benefitProfileRepository){
        this.benefitProfileRepository = benefitProfileRepository;
    }

    // Create
    public BenefitProfile create(BenefitProfile benefitProfile){
        return benefitProfileRepository.save(benefitProfile);
    }

    // Read
    public List<BenefitProfile> getAll(){
        return (List<BenefitProfile>) benefitProfileRepository.findAll();
    }

    // Update
    public BenefitProfile update(BenefitProfile benefitProfile){

        return benefitProfileRepository.save(benefitProfile);
    }

    // Delete
    public void delete(Long id){
        benefitProfileRepository.deleteById(id);
    }
}
