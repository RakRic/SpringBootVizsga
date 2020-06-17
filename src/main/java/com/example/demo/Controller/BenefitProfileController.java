package com.example.demo.Controller;

import com.example.demo.Model.BenefitProfile;
import com.example.demo.Service.BenefitProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BenefitProfileController {
    private final BenefitProfileService benefitProfileService;

    public BenefitProfileController(BenefitProfileService benefitProfileService){
        this.benefitProfileService = benefitProfileService;
    }

    // Create
    @PostMapping(path = "/createBenefitProfile")
    public BenefitProfile create(@RequestBody BenefitProfile benefitProfile){
        return benefitProfileService.create(benefitProfile);
    }

    // Read
    @GetMapping(path = "/benefitProfiles")
    public List<BenefitProfile> getAll(){
        return benefitProfileService.getAll();
    }

    // Update
    @PostMapping(path = "/updateBenefitProfile")
    public BenefitProfile update(BenefitProfile benefitProfile){
        return benefitProfileService.update(benefitProfile);
    }

    // Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/benefitProfile/{id}")
    public void delete(@PathVariable("id")Long id){
        benefitProfileService.delete(id);
    }
}
