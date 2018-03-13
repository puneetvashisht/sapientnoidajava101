package com.sapient.day1;

public class User extends Object{
	
	int id;
	public String email;
	String password;
	public User(){
		
	}
	public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
