package me.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import me.beans.Student;
import me.dao.StudentDAO;
import me.dao.StudentImpDAO;
import me.dbConnection.DbConnectioon;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(21);
		student.setName("Sanju");
		student.setMarks(89);
		
		StudentDAO studentDAO = new StudentImpDAO();
		boolean status = studentDAO.addStdDetails(student);
		if(status) {
			System.out.println("Sucess");
		}else {
			System.out.println("Fail");
		}
	}
}
