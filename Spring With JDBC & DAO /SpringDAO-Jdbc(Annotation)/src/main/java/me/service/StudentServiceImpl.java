package me.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.beans.Student;
import me.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentServicee{
	@Autowired
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
