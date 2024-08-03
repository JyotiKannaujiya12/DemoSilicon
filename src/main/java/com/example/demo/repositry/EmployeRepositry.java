package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.intity.Employee;

public interface EmployeRepositry extends JpaRepository<Employee,Long>{

}
