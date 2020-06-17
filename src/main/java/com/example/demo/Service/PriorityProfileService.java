package com.example.demo.Service;

import com.example.demo.Model.PriorityProfile;
import com.example.demo.Repository.PriorityProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityProfileService {
    private final PriorityProfileRepository priorityProfileRepository;

    public PriorityProfileService(PriorityProfileRepository priorityProfileRepository){
        this.priorityProfileRepository = priorityProfileRepository;
    }

    // Create
    public PriorityProfile create(PriorityProfile priorityProfile){
        return priorityProfileRepository.save(priorityProfile);
    }

    // Read
    public List<PriorityProfile> getAll(){
        return (List<PriorityProfile>) priorityProfileRepository.findAll();
    }

    // Update
    public PriorityProfile update(PriorityProfile priorityProfile){
        return priorityProfileRepository.save(priorityProfile);
    }

    // Delete
    public void delete(Long id){
        priorityProfileRepository.deleteById(id);
    }
}
