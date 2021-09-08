package com.example.demo.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.EmployeeRepository;

@SpringBootTest
class EmployeeTest4 {
	
	@Autowired
	EmployeeRepository uRepo;

	@Test
 	public void testDelete () {
 	uRepo.deleteById((long) 15);
 		assertThat(uRepo.existsById((long) 15)).isFalse();
 	}

}
