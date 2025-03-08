package me.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import me.beans.Student;
import me.dbConnection.DbConnectioon;

public class StudentImpDAO implements StudentDAO {

	@Override
	public boolean addStdDetails(Student student) {
		boolean status = false;
		try {
			// because getConnection is a static method so we can call this with the name.
			Connection con = DbConnectioon.getConnection();
			PreparedStatement preparedStatement = 
					con.prepareStatement("insert into Student values(?,?,?)");
			// 1 pehela ? mein jayega 2 dusra ? mein jayega and further.
			preparedStatement.setString(1, student.getName());
			preparedStatement.setInt(2, student.getAge());
			preparedStatement.setInt(3, student.getMarks());
			
			int count = preparedStatement.executeUpdate();
			if(count > 0) {
				status = true;
			}else {
				status = false;
			}
			
			
		}catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}
	
}
