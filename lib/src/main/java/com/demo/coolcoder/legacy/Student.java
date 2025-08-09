package com.demo.coolcoder.legacy;

public class Student {

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	public Student(int id, String name, Department department) {//Constrctor based injection
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	private int id;

	private String name;
	
	private Department department;

}
