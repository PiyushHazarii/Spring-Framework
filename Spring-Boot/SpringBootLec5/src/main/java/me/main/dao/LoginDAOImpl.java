package me.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import me.main.beans.Student;
import me.main.mappers.StudentMapper;

@Repository
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loginDao(String email,String password){
		
		List<Student> students_list = null;
		try{
		    String mysql_query = "select * from stdd where email=? and password=?";
		    students_list = jdbcTemplate.query(mysql_query, 
		    				new StudentMapper(), new Object[] { email, password }); 
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return students_list;
	}

}
