package com.app.bajajTest.model;

import java.util.List;

public class RequestModel {

	
	private String fullName;
	private String dob;
	private String email;
	private String rollNo;
	private List<String> data;
	public RequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestModel(String fullName, String dob, String email, String rollNo, List<String> data) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.email = email;
		this.rollNo = rollNo;
		this.data = data;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	
	
	
	
}
