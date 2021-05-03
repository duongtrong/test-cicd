package com.teamcity.democicd.repository;

import com.teamcity.democicd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * demo-cicd
 *
 * @author duongtrong
 * @version 1.0.0
 * @createdAt 30/04/2021 - 21:28
 * @createdBy duongtrong
 * @since 30/04/2021
 **/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
