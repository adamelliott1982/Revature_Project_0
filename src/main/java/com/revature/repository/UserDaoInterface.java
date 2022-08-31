package com.revature.repository;

import com.revature.services.models.User;

public interface UserDaoInterface {

	User createUser(User newUser);
	
	User getUser(String username, String password);
	
	User updateUser(User updatedUser);
	
	boolean deleteUser(User user);
	
}
