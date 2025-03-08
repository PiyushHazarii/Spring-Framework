package me.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectioon {
	public static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jbdc","root","piyush.hazari11");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

