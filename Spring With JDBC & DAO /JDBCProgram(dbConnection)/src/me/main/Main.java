package me.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jbdc","root","piyush.hazari11");
			
			PreparedStatement preparedStatement = 
					con.prepareStatement("insert into Student values(?,?,?)");
			// 1 pehela ? mein jayega 2 dusra ? mein jayega and further.
			preparedStatement.setString(1, "Piyush");
			preparedStatement.setInt(2, 21);
			preparedStatement.setInt(3, 89);
			
			int count = preparedStatement.executeUpdate();
			if(count > 0) {
				System.out.println("Sucess");
			}else {
				System.out.println("Fail");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
