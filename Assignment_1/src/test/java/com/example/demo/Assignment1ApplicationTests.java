package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@SpringBootTest
class Assignment1ApplicationTests {
	
	@Autowired
	private StudentDao Sd1;
	
	@Test
	public void testSaveStudent() {
		Student s1 = new Student(3L, "Sakshi", "Mahadik", "sakshi@gmail.com", "123456789", "11/4/1999", "Female", "Nambia", "dont know", "Dontknow");
		Sd1.save(s1);
		System.out.println(s1);
	}
	@Test
	public void findById() {
		Optional<Student>V=Sd1.findById(2L);
		System.out.println(V);
		
	}
	@Test
	public void deleteById() {
	Sd1.deleteById(2L);
	}
	@Test
	public void findAll() {
		List<Student>A=Sd1.findAll();
		System.out.println(A);
	}

}
