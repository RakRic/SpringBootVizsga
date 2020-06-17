package com.example.demo.Controller;

import com.example.demo.Model.JobSeeker;
import com.example.demo.Model.PriorityProfile;
import com.example.demo.Model.ProgrammingLanguage;
import com.example.demo.Service.JobSeekerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobSeekerController {
    private final JobSeekerService jobSeekerService;

    public JobSeekerController(JobSeekerService jobSeekerService){
        this.jobSeekerService = jobSeekerService;
    }
    // Create
    @PostMapping(path = "/createJobSeeker")
    public JobSeeker create(@RequestBody JobSeeker jobseeker){
        return jobSeekerService.create(jobseeker);
    }

    // Read
    @GetMapping (path = "/jobseekers")
    public List<JobSeeker> getAll(){
        return jobSeekerService.getAll();
    }

    //Update
    @PostMapping(path ="/updateJobSeeker")
    public JobSeeker update(@RequestBody JobSeeker jobseeker){
        return jobSeekerService.update(jobseeker);
    }

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/jobseeker/{id}")
    public void delete(@PathVariable("id")Long id){
        jobSeekerService.delete(id);
    }

    //GetJobseekerById
    @RequestMapping(method = RequestMethod.GET, value = "/jobseeker/{id}")
    public JobSeeker getJobseekerById(@PathVariable("id")Long id){
        return jobSeekerService.getJobseekerById(id);
    }

    //getPrioritiesByJobseekerId
    @GetMapping(path = "/jobseeker/{id}/priorities")
    public List<PriorityProfile> getPrioritiesByJobseekerId(@PathVariable("id")Long id) {return jobSeekerService.getPrioritiesByJobseekerId(id);}

    //getProgLanguagesByJobseekerId
    @GetMapping(path = "/jobseeker/{id}/programminglanguages")
    public List<String> getProgLanguagesByJobseekerId(@PathVariable("id")Long id){
        return jobSeekerService.getProgLanguagesByJobseekerId(id);
    }
}
