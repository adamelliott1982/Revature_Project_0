package com.revature.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.services.LoginService;
import com.revature.services.models.Customer;
import com.revature.services.models.User;

public class UserController implements UserInputInterface, LoginInterface{

	private Scanner sc;
	private LoginService loginService;
	
	public UserController(Scanner sc, LoginService loginService) {
		super();
		this.sc = sc;
		this.loginService = loginService;
	}

	public User validateLogin(String username, String password) {
		
		if(username == null && password == null) {
			return null;
		}
		
		User user = loginService.login(username, password);
		return user;
	}

	public String getUserInput() {
		System.out.println("Hello, please input something: ");
		return sc.nextLine();
	}

	public void login() {
		System.out.println("Please login with username and password \n");
		String username = getUserInput();
		String password = getUserInput();
		
		
		User user = null;
		
		final String sql = "SELECT * FROM users WHERE username = '"+username+"' and password = '"+password+"';" ;
		
		try (Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://database-1.cto2klb1wsas.us-east-1.rds.amazonaws.com:5432/postgres", 
				"postgres",
				"Wsxedc3#");
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
			e.printStackTrace();
		}
		
		if(user != null) {
			System.out.println("Successful login!");
			System.out.println(user);
		} else {
			System.out.println("Failed login!");
		}
	}

	
	
}
