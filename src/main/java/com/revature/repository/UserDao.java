package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.services.models.Customer;
import com.revature.services.models.User;
import com.revature.util.ConnectionFactory;

public class UserDao implements UserDaoInterface{
	
	Logger consoleLogger;
	Logger fileLogger;
	

	public UserDao(){
		consoleLogger = LoggerFactory.getLogger("consoleLogger");
		fileLogger = LoggerFactory.getLogger("fileLogger");
	}
	
	public User createUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		consoleLogger.debug("Getting user with username: " + username);
		fileLogger.debug("Getting user from database");
		
		User user = null;
		
		final String sql = "SELECT * FROM users WHERE username = '"+username+"' ;" ;
		
		try (Connection connection = ConnectionFactory.getConnection();
				Statement statement = connection.createStatement();) 
		{		
			ResultSet set = statement.executeQuery(sql);

			if(set.next()) {
				user = new Customer(
						set.getString(2),
						set.getString(3),
						set.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			consoleLogger.error(e.getMessage());
			//e.printStackTrace();
			fileLogger.error(e.toString());
		}
		
	
		return user;
		
	}

	public User updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
