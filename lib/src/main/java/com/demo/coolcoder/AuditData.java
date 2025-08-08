package com.demo.coolcoder;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditData {
	
	String name() default "test_user";//optional Parameter
	
	String [] value(); //required Parameter

}
