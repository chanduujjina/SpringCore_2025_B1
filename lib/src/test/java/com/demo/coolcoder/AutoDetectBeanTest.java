package com.demo.coolcoder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.coolcoder.di.autodetect.TestService;
import com.demo.coolcoder.di.autodetect.TestService2;
import com.demo.coolcoder.di.autodetect.TestService3;
import com.demo.coolcoder.di.autodetect.TestService4;

public class AutoDetectBeanTest {

	static ApplicationContext applicationContext;

	@BeforeAll
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	void testAutoDetctAutoScanBean_component() {
		TestService testService = applicationContext.getBean(TestService.class);
		assertNotNull(testService);
		testService.m1();
	}
	
	@Test
	void testAutoDetctAutoScanBean_service() {
		TestService2 testService2 = applicationContext.getBean(TestService2.class);
		assertNotNull(testService2);
		testService2.m1();
	}
	
	@Test
	void testAutoDetctAutoScanBean_controller() {
		TestService3 testService3 = applicationContext.getBean(TestService3.class);
		assertNotNull(testService3);
		testService3.m1();
	}
	
	@Test
	void testAutoDetctAutoScanBean_repository() {
		TestService4 testService4 = applicationContext.getBean(TestService4.class);
		assertNotNull(testService4);
		testService4.m1();
	}

}
