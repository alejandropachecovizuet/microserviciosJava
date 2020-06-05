package com.interware.curso.employeeMicroservice.repository;

import com.interware.curso.employeeMicroservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

