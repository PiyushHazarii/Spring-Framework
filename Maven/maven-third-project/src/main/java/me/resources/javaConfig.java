package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Student;

@Configuration
public class javaConfig {

	@Bean
	public Student student() {
		Student stdStudent = new Student();
		stdStudent.setId(113);
		stdStudent.setName("Piyush");
		return stdStudent;
	}
}
