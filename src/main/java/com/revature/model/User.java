package com.revature.model;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
// fields
	public static Integer numberOfUsers = 0;
	
	// list of accounts
	ArrayList<String> accounts = new ArrayList<String>( 
            Arrays.asList("test"));
	String userName;
	// address
	String address;
	// phone
	String phone;
	// zipcode
	String zipcode;
	// unique user ID
	Integer userId;
	
	public User(String userName, String address, String phone, String zipcode) {
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.zipcode = zipcode;
		// assign the next available number
		this.userId = User.numberOfUsers;
		// increment number of users for next userId
		User.numberOfUsers += 1;
	}
	

// methods
	@Override
	public String toString() {
		return "User [accounts=" + accounts + ", userName=" + userName + ", address=" + address + ", phone=" + phone
				+ ", zipcode=" + zipcode + ", userId=" + userId + "]";
	}
	
	public void testUser() {
		User user1 = new User("rs123", "123 somewhere", "123-456-7890", "98192");
		System.out.println(user1);
	}
	
}
