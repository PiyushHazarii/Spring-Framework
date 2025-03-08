package me.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import me.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	boolean status = false;

	@Override
	public boolean addStdDetails(Student student) {
		String sql_query = "insert into Student values(?,?,?)";
		// jaise ki jdbc mein prepared statement use hota hai waise hi spring mein 
		// jdbc template use hota hai data ko set and sql mein set krwane ke liye
		int count = jdbcTemplate.update(sql_query,student.getNameString()
										,student.getAge(),student.getMarks());
		if(count > 0) {
			status = true;
		}
		return status;
	}

}
