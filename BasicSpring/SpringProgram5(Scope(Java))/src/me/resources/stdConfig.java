package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import me.beans.Student;

@Configuration
public class stdConfig {
	
	@Bean(name = "stdd")
	@Scope("prototype")
	public Student std() {
		Student stdStudent = new Student();
		
		stdStudent.setMarks(50);
		stdStudent.setName("Piyush");
		
		return stdStudent;
	}
}
