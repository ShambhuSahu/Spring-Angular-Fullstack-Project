package com.crossasyst.userRegistrationProject.repository;

import com.crossasyst.userRegistrationProject.entity.EmployeeRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRecordRepository extends JpaRepository<EmployeeRecordEntity,Long> {
}
