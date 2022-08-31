package com.revature.services;

import com.revature.repository.UserDaoInterface;
import com.revature.services.models.User;
import com.revature.services.models.UserInterface;

public class LoginService implements UserInterface{

	private UserDaoInterface userDao;
	
	public LoginService(UserDaoInterface userDao) {
		super();
		this.userDao = userDao;
	}

	public User login(String username, String password) {
		User user = userDao.getUser(username, password);
		if(user.getPassword().equals(password)) {
			return user;
		} else {
			return null;
		}

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
