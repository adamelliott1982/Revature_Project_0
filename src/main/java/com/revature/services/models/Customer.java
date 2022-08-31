package com.revature.services.models;

public class Customer extends User{

	public Customer(String username, String password, String email) {
		super(username, password, email);
		// TODO Auto-generated constructor stub
	}

	public boolean login(String username, String password) {
		
		return false;
	}

	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return false;
	}



}
