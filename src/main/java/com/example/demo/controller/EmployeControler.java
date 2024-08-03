package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.intity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeControler {

	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/post")
	public Employee postData(@RequestBody Employee employee)
	{
	Employee post=employeeService.createEmployee(employee);
		return post;
	}
	
}
