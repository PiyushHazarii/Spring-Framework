package me.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Student;

@Configuration
public class SpringConfig {
	
//	We will provide another name for bean if does not provide then it is same as the method name
//	but if we provide the name then we have to call it with that name 
	
	@Bean(name = "stddd")
	public Student stdcsd() {
		Student student = new Student();
		
		student.setMarks(90);
		student.setName("Piyush");
		
		return student;
	}
}
