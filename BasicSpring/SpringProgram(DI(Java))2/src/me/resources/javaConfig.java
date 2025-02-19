package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Address;
import me.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean
	public Address createAddress() {
		Address address = new Address();
		address.setAddName("Sukhi Bhawan");
		address.setHouseNo(222);
		address.setCity("Dhanbad");
		return address;
	}
	
	@Bean
	public Student createStudent() {
		Student student = new Student();
		student.setName("Piyush");
		student.setRollno(113);
		student.setMarks(89.3f);
		student.setAddress(createAddress());
		return student;
	}
}
