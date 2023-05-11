package com.crossasyst.userRegistrationProject.repository;

import com.crossasyst.userRegistrationProject.entity.SignUpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUpEntity,Long> {
}
