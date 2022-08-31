package com.revature.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLoggingDemo {

	public static void main(String[] args) {
		
		Logger consoleLogger = LoggerFactory.getLogger("consoleLogger");
		Logger fileLogger = LoggerFactory.getLogger("fileLogger");
		
		consoleLogger.debug("Debugging an issue right now in my application");
		fileLogger.error("Logging at error");
		
	}
	
}
