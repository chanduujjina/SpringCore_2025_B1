package com.demo.coolcoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.demo.coolcoder.legacy.Address;
import com.demo.coolcoder.legacy.Department;
import com.demo.coolcoder.legacy.Employee;
import com.demo.coolcoder.legacy.Student;

public class DependencyLegacyTest {
	
	@Test
	public void testAssocation() {
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("test");
		
		Address address = new Address();
		employee.setAdddres(address);//assemling objects
		
		assertNotNull(employee.getAdddres());
	}
	
	@Test
	public void testAssocationThroughConstrctor() {
		Department department = new Department();//creating object for dependent class
		department.setId(1);
		department.setName("it");
		Student student = new Student(1, "test", department);//assesmbling dependent object to main object
		
		assertNotNull(student.getDepartment());
		
		assertEquals("it", student.getDepartment().getName());
	}
	

}
