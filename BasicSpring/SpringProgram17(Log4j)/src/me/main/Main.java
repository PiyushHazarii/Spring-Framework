package me.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		
//		Thread.currentThread().setName("Piyush");  
		
		System.out.println("----------------------App Starts----------------------------");
		
		BasicConfigurator.configure();
		 
		Logger logger = Logger.getLogger("Main");
		logger.fatal("This is fatal message");
		logger.error("This is an error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("-----------------------App Ends-------------------------------");
	}
}
