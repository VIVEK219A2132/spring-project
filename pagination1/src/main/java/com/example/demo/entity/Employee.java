package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	public Employee(long l, String string, String string2, String string3, int i, String string4) {
		// TODO Auto-generated constructor stub
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String department;
	private String designation;
	private Integer salary;
	private String city;
	
	
	
	
}
