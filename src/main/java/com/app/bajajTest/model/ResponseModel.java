package com.app.bajajTest.model;

import java.util.List;

public class ResponseModel {

	
	
	private boolean status;
	private String userId;
	private String email;
	private String rollNo;
	
	private List<String> numbers;
	private List<String> alphabates;
	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseModel(boolean status, String userId, String email, String rollNo, List<String> numbers,
			List<String> alphabates) {
		super();
		this.status = status;
		this.userId = userId;
		this.email = email;
		this.rollNo = rollNo;
		this.numbers = numbers;
		this.alphabates = alphabates;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public List<String> getAlphabates() {
		return alphabates;
	}
	public void setAlphabates(List<String> alphabates) {
		this.alphabates = alphabates;
	}
	
	
	
	
}
