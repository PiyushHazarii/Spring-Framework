package me.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.entity.Student;
public class StudentDaoImpl implements StudentDAO {
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void searchStudent(int n) {
		try {
			Student student = entityManager.find(Student.class, n);
			System.out.println("===============================");
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getMarks());
			System.out.println("===============================");
		}catch (Exception e) {
			System.out.println("Student Details Not Found");
			e.printStackTrace();
		}
	}

}
