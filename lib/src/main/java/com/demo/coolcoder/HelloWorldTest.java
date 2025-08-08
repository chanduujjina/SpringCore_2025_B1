package com.demo.coolcoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	
	public static void main(String[] args) {
		
		
		//load the container related to xml
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Helloworld helloworld = (Helloworld)applicationContext.getBean("helloWord");
		helloworld.sayHi();
	}

}
