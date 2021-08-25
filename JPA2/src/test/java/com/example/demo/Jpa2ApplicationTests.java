package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@SpringBootTest
class Jpa2ApplicationTests {
 
	@Autowired
	private StudentDao dao;
	@Test
	public void saveStudent () {
		Student s1= new Student(132L, "Vivek", "SIES GST");
		dao.save(s1);
		System.out.println("Data Saved Successfully");
	}
	

}
