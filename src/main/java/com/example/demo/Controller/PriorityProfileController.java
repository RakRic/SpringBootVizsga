package com.example.demo.Controller;

import com.example.demo.Model.PriorityProfile;
import com.example.demo.Service.PriorityProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriorityProfileController {
    private final PriorityProfileService priorityProfileService;

    public PriorityProfileController(PriorityProfileService priorityProfileService){
        this.priorityProfileService = priorityProfileService;
    }

    // Create
    @PostMapping(path = "/createPriorityProfile")
    public PriorityProfile create(@RequestBody PriorityProfile priorityProfile){
        return priorityProfileService.create(priorityProfile);
    }

    // Read
    @GetMapping(path = "/priorityProfiles")
    public List<PriorityProfile> getAll(){
        return priorityProfileService.getAll();
    }

    // Update
    @PostMapping(path = "/updatePriorityProfile")
    public PriorityProfile update(@RequestBody PriorityProfile priorityProfile){
        return priorityProfileService.update(priorityProfile);
    }

    // Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/priorityProfile/{id}")
    public void delete(@PathVariable("id")Long id){
        priorityProfileService.delete(id);
    }

}
