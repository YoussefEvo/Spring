package com.bean.springExemple;

import java.util.List;


public class User {
	
	String firstName  = null;
	String lastName = null;
	List<String> email = null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void toPrint(User user){
		System.out.println("first Name : " + user.getFirstName() );
		System.out.println("Last Name : " + user.getLastName() );
		for(String list : email){
			System.out.println(list);
		}
	}
}
