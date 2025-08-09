package com.demo.coolcoder.legacy;

public class Employee {
	
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdddres() {
		return adddres;
	}

	public void setAdddres(Address adddres) {//setter based inject
		this.adddres = adddres;
	}

	private Address adddres;//has a realtion

}
