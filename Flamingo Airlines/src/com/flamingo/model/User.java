package com.flamingo.model;

public class User {
	private int userId;
	private String emailId;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId + ", password=" + password + "]";
	}
	public User(int userId, String emailId, String password) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
}
