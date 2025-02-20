package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Address;
import me.beans.Student;

@Configuration
public class javaConfig {
	@Bean
	public Address creAddress() {
		Address address = new Address();
		address.setAddName("Sukhi Bhawan");
		address.setCity("Dhanbad");
		address.setHouseNo(007);
		return address;
	}
	
	// when there are more than one object present than we have to use Qualifier then we use
	// that object for the autowiring
	
	@Bean
	public Student crStudent() {
		Student student = new Student();
		student.setName("piysussss");
		student.setMarks(94);
		student.setRollno(113);
		// if we put autowiring before the field of address is declared in student then 
		// we need not have to set the address by ourself it will done by spring 
//		student.setAddress(creAddress());
		return student;
	}
}
