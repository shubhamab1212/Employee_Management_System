package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.EmployeeRepository;


@SpringBootTest
class EmployeeTest3 {

	@Autowired
	EmployeeRepository uRepo;
	
   @Test
	public void testCreate () {
		Employee u = new Employee();
		u.setId(4);
		u.setFirstName("Shantanu");
		u.setLastName("Mane");
		u.setEmailId("shantanu@mane");
		
		uRepo.save(u);
		//assertNotNull(uRepo.(17).get());
	

}
 
}
