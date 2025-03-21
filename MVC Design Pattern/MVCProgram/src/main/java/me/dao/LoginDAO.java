package me.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import me.beans.Student;
import me.database.DbConnection;

public class LoginDAO {
	
	public Student loginDao(String email, String pass) {
		Student student = null;
//		if(email.equals("aaa@gmail.com") && pass.equals("1234")){
//			student = new Student();
//			student.setEmail("sdfasdf@gmail.com");
//			student.setName("Piyush Hazari");
//		}
		
		try {
			Connection connection = DbConnection.getConnection();
			
			PreparedStatement preparedStatement = 
					connection.prepareStatement("select * from mee where email=? and password=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, pass);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				student = new Student();
				student.setName(resultSet.getString("name"));
				student.setEmail(resultSet.getString("email"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
		
		
	}
}
