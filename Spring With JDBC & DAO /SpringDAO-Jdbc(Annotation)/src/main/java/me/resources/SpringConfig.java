package me.resources;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import me.beans.Student;
import me.dao.StudentDAO;
import me.dao.StudentDaoImpl;
import me.service.StudentServiceImpl;
import me.service.StudentServicee;

@Configuration
@ComponentScan(basePackages = "me")
public class SpringConfig {

	// this is used for build the connextion set the password and username
	@Bean
	public DataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jbdc");
		dataSource.setUsername("root");
		dataSource.setPassword("piyush.hazari11");
		
		return dataSource;
	}
	
	// 
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
	}
	
	
}
