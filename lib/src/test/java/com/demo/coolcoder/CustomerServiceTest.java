package com.demo.coolcoder;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceTest {
	
	@Test
	public void testLifecycleMethods() {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		
		List<Customer> customers = customerService.getCustomers();
		
		System.out.println(customers);
		
		applicationContext.close();
	}

}
