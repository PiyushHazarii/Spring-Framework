package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean
	public Student crStudent() {
		Student student = new Student();
		student.setMarks(10);
		student.setName("Piyush");
		student.setRollno(32);
		return student;
	}
}
