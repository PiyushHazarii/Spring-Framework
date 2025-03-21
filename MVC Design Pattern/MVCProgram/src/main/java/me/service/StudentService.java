package me.service;

import me.beans.Student;
import me.dao.LoginDAO;

public class StudentService {

	public Student loginService(String email, String pass) {
		LoginDAO dao = new LoginDAO();
		Student student = dao.loginDao(email, pass);
		return student;
	}
}
