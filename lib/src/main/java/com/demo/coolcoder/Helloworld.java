package com.demo.coolcoder;

public class Helloworld {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public void sayHi() {
		System.out.println("Hi "+name+ " welcome to Spring world");
	}

}
