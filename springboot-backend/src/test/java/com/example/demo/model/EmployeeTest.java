package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	//create Employee instance
	Employee name = new Employee("Shantanu", "Mane", "shantanu@mane");
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetFirstName() {
		String expected = "Shantanu";
		String actual = name.getFirstName();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	void testGetLastName() {
		String expected = "Mane";
		String actual = name.getLastName();
		assertTrue(expected.equals(actual));		
		//fail("Not yet implemented");
	}

	@Test
	void testGetEmailId() {
		String expected = "shantanu@mane";
		String actual = name.getEmailId();
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

}
