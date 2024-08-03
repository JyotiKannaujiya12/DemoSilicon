package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.intity.Employee;
import com.example.demo.repositry.EmployeRepositry;

@Service

public class EmployeeService {

	@Autowired
	
	private EmployeRepositry employeRepositry;
	public Employee createEmployee(Employee employee)
	{
		return employeRepositry.save(employee);
	}
}
