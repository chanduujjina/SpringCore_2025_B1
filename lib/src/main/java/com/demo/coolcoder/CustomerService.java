package com.demo.coolcoder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomerService implements BeanNameAware,BeanFactoryAware,BeanPostProcessor,InitializingBean {

	
	private List<Customer> customerList = null;
	
	  @Override
		public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("inside pre Intalization bean");
			return bean;
		}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("intalitlizing bean afterPropertiesSet");
		customerList = new ArrayList<>();
		
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Inside setBeanFactory");
		
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("Inside setBeanName");
		
	}
	
	public void customInit() {
		System.out.println("Inside customInit method");
		customerList.add(new Customer(1, "test1", "normal"));
		customerList.add(new Customer(2, "test2", "prime"));
		customerList.add(new Customer(3, "test3", "pro prime"));
	}
  

	
    @Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inside post Intalizing");
		return bean;
	}
	
	
	
	public  List<Customer> getCustomers(){
		return customerList;
	}
	
	
	public void customDestroy() {
		System.out.println("Inside customDestroy method");
	}

}
