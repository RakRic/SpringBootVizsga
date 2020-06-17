package com.example.demo.Service;

import com.example.demo.Model.JobSeeker;
import com.example.demo.Model.PriorityProfile;
import com.example.demo.Model.ProgrammingLanguage;
import com.example.demo.Repository.JobSeekerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerService {
    private final JobSeekerRepository jobSeekerRepository;

    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    // Create
    public JobSeeker create(JobSeeker jobseeker){
        return jobSeekerRepository.save(jobseeker);
    }

    // Read
    public List<JobSeeker> getAll(){
        return (List<JobSeeker>) jobSeekerRepository.findAll();
    }

    //Update
    public JobSeeker update(JobSeeker jobseeker){
        return jobSeekerRepository.save(jobseeker);
    }

    //Delete
    public void delete(Long id){
        jobSeekerRepository.deleteById(id);
    }

    //GetJobseekerById
    public JobSeeker getJobseekerById(Long id){
        Optional<JobSeeker> optionalJobSeeker = jobSeekerRepository.findById(id);
        if(optionalJobSeeker.isPresent()){
            return optionalJobSeeker.get();
        }else {
            throw new JobSeekerIdNotFound("There is no Jobseeker by this id");
        }
    }

    //getPrioritiesByJobseekerId
    public List<PriorityProfile> getPrioritiesByJobseekerId(Long jobseekerId) {
        ArrayList<Object[]> returnedValues = new ArrayList<Object[]>(jobSeekerRepository.getPrioritiesByJobseekerId(jobseekerId));
        ArrayList<PriorityProfile> priorities = new ArrayList<PriorityProfile>();
        for(Object[] o : returnedValues) {
            priorities.add(new PriorityProfile(
                    Long.parseLong(o[0].toString()),
                    Long.parseLong(o[1].toString()),
                    Long.parseLong(o[2].toString()),
                    Integer.parseInt(o[3].toString())));
        }

        return priorities;
    }

    //getProgLanguagesByJobseekerId
    public List<String> getProgLanguagesByJobseekerId(Long jobseekerId) {
        return jobSeekerRepository.getProgLanguagesByJobseekerId(jobseekerId);
    }


}
