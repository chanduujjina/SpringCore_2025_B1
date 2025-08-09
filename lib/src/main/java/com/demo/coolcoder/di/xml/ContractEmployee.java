package com.demo.coolcoder.di.xml;

public class ContractEmployee extends BaseEmployee{
	
	public String getPayRollCompanyName() {
		return payRollCompanyName;
	}

	public void setPayRollCompanyName(String payRollCompanyName) {
		this.payRollCompanyName = payRollCompanyName;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	private String payRollCompanyName;
	
	private String contractStartDate;
	
	private String contractEndDate;

}
