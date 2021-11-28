package com.platform.spring.h2.api.repository;

import java.util.List;

import com.platform.spring.h2.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDept(String dept);

}