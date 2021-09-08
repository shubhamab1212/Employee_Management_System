package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest2 {
	@Test
	void testGetId() {
		Employee u = new Employee();
		u.setId(13);
		assertTrue(u.getId() == 13);
		//fail("Not yet implemented");
	}

	@Test
	void testSetId() {
		Employee u = new Employee();
		u.setId(13);
		assertTrue(u.getId() == 13);
		//fail("Not yet implemented");
	}

	@Test
	void testGetFirstName() {
		Employee u = new Employee();
		u.setFirstName("shantanu");
		assertTrue(u.getFirstName() == "shantanu");
		//fail("Not yet implemented");
	}

	@Test
	void testSetFirstName() {
		Employee u = new Employee();
		u.setFirstName("shantanu");
		assertTrue(u.getFirstName() == "shantanu");
		//fail("Not yet implemented");
	}

	@Test
	void testGetLastName() {
		Employee u = new Employee();
		u.setLastName("mane");
		assertTrue(u.getLastName() == "mane");
		//fail("Not yet implemented");
	}

	@Test
	void testSetLastName() {
		Employee u = new Employee();
		u.setLastName("mane");
		assertTrue(u.getLastName() == "mane");
		//fail("Not yet implemented");
	}

	@Test
	void testGetEmailId() {
		Employee u = new Employee();
		u.setEmailId("shantanu@mane");
		assertTrue(u.getEmailId() == "shantanu@mane");
		//fail("Not yet implemented");
	}

	@Test
	void testSetEmailId() {
		Employee u = new Employee();
		u.setEmailId("shantanu@mane");
		assertTrue(u.getEmailId() == "shantanu@mane");
		//fail("Not yet implemented");
	}

}
