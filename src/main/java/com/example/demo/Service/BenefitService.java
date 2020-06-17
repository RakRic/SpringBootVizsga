package com.example.demo.Service;

import com.example.demo.Model.Benefit;
import com.example.demo.Repository.BenefitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitService {
    private final BenefitRepository benefitRepository;

    public BenefitService(BenefitRepository benefitRepository){
        this.benefitRepository = benefitRepository;
    }

    // Create
    public Benefit create(Benefit benefit){
        return benefitRepository.save(benefit);
    }

    // Read
    public List<Benefit> getAll(){
        return (List<Benefit>) benefitRepository.findAll();
    }

    // Update
    public Benefit update(Benefit benefit){
        return benefitRepository.save(benefit);
    }

    // Delete
    public void delete(Long id){
        benefitRepository.deleteById(id);
    }
}
