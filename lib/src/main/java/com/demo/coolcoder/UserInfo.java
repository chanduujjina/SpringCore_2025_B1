package com.demo.coolcoder;

import java.util.List;

@AuditData(value = {"chandu","ujjina"})
public class UserInfo {
	
	private String userFirstName;
	
	private String lastName;
	
	private String audtitData;
	
	private String dateInfo;
	
	public String getDateInfo() {
		return dateInfo;
	}

	public void setDateInfo(String dateInfo) {
		this.dateInfo = dateInfo;
	}

	public String getAudtitData() {
		return audtitData;
	}

	public void setAudtitData(String audtitData) {
		this.audtitData = audtitData;
	}

	@Mask(name = "password")
	private String password;
	
	@Mask(name = "phoneNumber")
	private String phoneNumber;
	
	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getMaskList() {
		return maskList;
	}

	public void setMaskList(List<String> maskList) {
		this.maskList = maskList;
	}

	private List<String> maskList;
	
	@LogTime(dateInfo= "06/08/2025")
	public String createDate() {
		return null;
	}

}
