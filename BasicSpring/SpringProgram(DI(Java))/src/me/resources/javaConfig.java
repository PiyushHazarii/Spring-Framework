package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Address;
import me.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean
	public Address createAddress() {
		Address address = new Address("Sukhi Bhawan", 222, "Dhanbad");
		return address;
	}
	
	@Bean
	public Student createStudent() {
		Student student = new Student("Piyush", 113, 98.3f,createAddress());
		return student;
	}
}
