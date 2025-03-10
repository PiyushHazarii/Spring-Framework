package me.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


import me.beans.Student;

public class StudentDaoIMPL implements StudentDAO{

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Transactional
	@Override
	public void addStdDetails(Student student) {
		try {
			hibernateTemplate.save(student);
			System.out.println("Success");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
