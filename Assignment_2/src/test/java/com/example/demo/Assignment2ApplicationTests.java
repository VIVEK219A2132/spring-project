package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.dao2.ContactDao;
import com.example.demo.entity2.Contact;

@SpringBootTest
class Assignment2ApplicationTests {

	@Autowired
	private ContactDao Cd1;
	
	@Test
	public void testSaveContact() {
		Contact s1 = new Contact(5L, "Shreya","Shreya@gmail.com","985647561");
		Cd1.save(s1);
		System.out.println(s1);
	}
	@Test
	public void findById() {
		Optional<Contact> V=Cd1.findById(2L);
		System.out.println(V);
		
	}
	@Test
	public void deleteById() {
	Cd1.deleteById(1L);
	}
	@Test
	public void findAll() {
		List<Contact> A=Cd1.findAll();
		System.out.println(A);
	}

}
