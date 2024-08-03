package com.example.demo.intity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Long empId;
	private  String name;
	private Long age;
	private String address;
}
