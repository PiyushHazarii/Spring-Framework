package me.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/mvc", "root", "piyush.hazari11"); // Replace "rc" with
																									// your actual
																									// password
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	} 
}
