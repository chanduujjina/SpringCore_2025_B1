package com.demo.coolcoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.coolcoder.di.xml.Appconfig;
import com.demo.coolcoder.di.xml.BaseDemo;
import com.demo.coolcoder.di.xml.ContractEmployee;
import com.demo.coolcoder.di.xml.Demo1;
import com.demo.coolcoder.di.xml.Demo3;
import com.demo.coolcoder.di.xml.Demo5;
import com.demo.coolcoder.di.xml.Demo7;
import com.demo.coolcoder.di.xml.Demo9;

public class AutowireTest {
	
	private static ApplicationContext applicationContext;
	
	@BeforeAll
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testNoAutowireType() {
		Demo1 demo1 = applicationContext.getBean(Demo1.class);
		assertNotNull(demo1);
		
		assertNotNull(demo1.getDemo2());
	}
	
	@Test
	public void testAutowireByType() {
		Demo3 demo3 = applicationContext.getBean(Demo3.class);
		assertNotNull(demo3);
		assertNotNull(demo3.getDemo4());
	}
	
	@Test
	public void testAutowireByName() {
		Demo5 demo5 = applicationContext.getBean(Demo5.class);
		assertNotNull(demo5);
		assertNotNull(demo5.getDm6_v1());
		
	}
	
	@Test
	public void testAutowireByConStrctor() {
		Demo7 demo7 = applicationContext.getBean(Demo7.class);
		assertNotNull(demo7);
		assertNotNull(demo7.getDemo8());
		
	}
	@Test
	public void testInheritanceBeanDI() {
		ContractEmployee baseEmployee =applicationContext.getBean("contract", ContractEmployee.class);
		baseEmployee.setEmpId(1);
		baseEmployee.setEmpName("test");
		assertNotNull(baseEmployee);
		assertNotNull(baseEmployee.getEmpName());
		
	}
	
	@Test
	public void testAutowireForAbstract() {
		Demo9 demo9 = applicationContext.getBean(Demo9.class);
		assertNotNull(demo9);
		assertNotNull(demo9.getBaseDemo());
		BaseDemo baseDemo = demo9.getBaseDemo();
		baseDemo.m1();
	
	}
	
	@Test
	public void testProperties() {
		Appconfig appconfig = applicationContext.getBean(Appconfig.class);
		assertNotNull(appconfig);
		assertEquals("spring core", appconfig.getAppName());
		assertEquals("1.0", appconfig.getVersion());
	}

}
