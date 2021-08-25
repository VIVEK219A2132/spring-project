package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@SpringBootTest
class Pagination1ApplicationTests {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Test
	public void saveEmployee() {
		Employee emp1=new Employee(6L, "Shraddha", "Product", "Software Engineer", 65000, "NaviMumbai");
		empRepo.save(emp1);
	}

	@Test
	public void testPageableEmployee () {
		
		int pageNo=1;
		int pageSize=3;
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
	    Page<Employee> findAll = empRepo.findAll(pageRequest);
	    System.out.println(findAll);
	}

}
