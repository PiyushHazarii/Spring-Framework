package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.beans.Employee;

@Configuration
public class empConfig {
	@Bean
	public Employee emp() {
		Employee employee = new Employee();
		
		employee.setId(001);
		employee.setName("PIYUSH");
		
		return employee;
	}
}
