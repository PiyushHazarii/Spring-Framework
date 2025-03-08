package me.service;

import me.beans.Student;
import me.dao.StudentDAO;

public class StudentServiceImpl implements StudentServicee{
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public boolean addStudentService(Student student) {
		boolean status = studentDAO.addStdDetails(student);
		return status;
	}
	
}
