package com.example.demo.Controller;

import com.example.demo.Model.Benefit;
import com.example.demo.Service.BenefitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BenefitController {
    private final BenefitService benefitService;

    public BenefitController(BenefitService benefitService){
        this.benefitService = benefitService;
    }

    // Create
    @PostMapping(path = "/createBenefit")
    public Benefit create(@RequestBody Benefit benefit){
        return benefitService.create(benefit);
    }

    // Read
    @GetMapping(path = "/benefits")
    public List<Benefit> getAll(){
        return benefitService.getAll();
    }

    // Update
    @PostMapping(path = "/updateBenefit")
    public  Benefit update(@RequestBody Benefit benefit){
        return  benefitService.update(benefit);
    }

    // Delete
     @RequestMapping(method = RequestMethod.DELETE, value = "/benefit/{id}")
    public void delete(@PathVariable("id")Long id){
        benefitService.delete(id);
     }
}
