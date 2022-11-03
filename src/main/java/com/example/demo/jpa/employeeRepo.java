package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Employee;

public interface employeeRepo extends JpaRepository<Employee, Long> {

}
