package me.main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {  
	public static void main(String[] args) throws 
	ClassNotFoundException, SQLException{
		
		// load and register driver.
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		// establish the connection between java and database
																			//name  password.   
		DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "piyush.hazari11");
		System.out.println("Success");
	}
}
// all the other part are in the screen shot so we can read that on 
// my spring and spring boot notes git hub.
// hikari wala mein sirf upar ka parts change hua baaki cut copy paste hai
// normal preparedStatement and statement wale se. 