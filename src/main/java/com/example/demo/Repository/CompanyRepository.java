package com.example.demo.Repository;

import com.example.demo.Model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Query(value =
            "SELECT b.name " +
            "from Company c inner join benefit_profile bp on c.id = bp.company_id " +
            "inner join benefit b on bp.benefit_id = b.id " +
            "where c.id = :company_id", nativeQuery = true)
    List<String> getBenefitsByCompanyId(@Param("company_id") Long companyId);
}
