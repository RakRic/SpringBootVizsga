package com.example.demo.Repository;

import com.example.demo.Model.JobSeeker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerRepository extends CrudRepository<JobSeeker, Long> {

    @Query(value =
            "SELECT pp.benefit_id, pp.id, pp.jobseeker_id, pp.value " +
            "from priority_profile pp " +
            "inner join job_seeker js on pp.jobseeker_id = js.id " +
            "inner join benefit b on pp.benefit_id = b.id " +
            "WHERE js.id = :jobseeker_id", nativeQuery = true)
    List<Object[]> getPrioritiesByJobseekerId(@Param("jobseeker_id") Long jobseekerId);

    @Query(value =
            "SELECT pl.name " +
            "FROM programming_language pl " +
            "INNER JOIN job_seeker js ON pl.jobseeker_id = js.id " +
            "WHERE js.id = :jobseeker_id", nativeQuery = true)
    List<String> getProgLanguagesByJobseekerId(@Param("jobseeker_id")Long jobseekerId);
}
