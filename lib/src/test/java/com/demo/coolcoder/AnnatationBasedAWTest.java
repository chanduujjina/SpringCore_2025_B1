package com.demo.coolcoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.coolcoder.di.anontation.AnnDemo1;
import com.demo.coolcoder.di.anontation.AnnDemo3;
import com.demo.coolcoder.di.anontation.AnnDemo5;

public class AnnatationBasedAWTest {
	
	static ApplicationContext applicationContext;
	
	
	@BeforeAll
	public static void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	 void testAnnonAutoWireByType() {
		AnnDemo1 annDemo1 = applicationContext.getBean(AnnDemo1.class);
		assertNotNull(annDemo1);
		
		assertNotNull(annDemo1.getAnnonDemo2());
	}
	
	
	@Test
	 void testAnnonAutoWireByName() {
		AnnDemo3 annDemo3 = applicationContext.getBean(AnnDemo3.class);
		assertNotNull(annDemo3);
		
		assertNotNull(annDemo3.getAnnDemo4());
		
		assertEquals(2, annDemo3.getAnnDemo4().getId());
	}
	
	@Test
	 void testAnnByConstrctor() {
		AnnDemo5 annDemo5 = applicationContext.getBean(AnnDemo5.class);
		
		assertNotNull(annDemo5);
		assertNotNull(annDemo5.getAnnDemo6());
		assertNotNull(annDemo5.getAnnDemo7());
		
		assertNotNull(annDemo5.getAnnDemo4());
	}


}
