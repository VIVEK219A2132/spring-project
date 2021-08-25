package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Long Id;
	private String name;
	private String college;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String name, String college) {
		super();
		Id = id;
		this.name = name;
		this.college = college;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", college=" + college + "]";
	}
	
}
