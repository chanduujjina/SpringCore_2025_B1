package com.demo.coolcoder.di.xml;

public class PermemnentEmployee extends BaseEmployee {
	
	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getPrviousComapnyDetails() {
		return prviousComapnyDetails;
	}

	public void setPrviousComapnyDetails(String prviousComapnyDetails) {
		this.prviousComapnyDetails = prviousComapnyDetails;
	}

	private String doj;
	
	private String prviousComapnyDetails;

}
