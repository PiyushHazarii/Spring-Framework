package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Employee;
import me.beans.Student;
import me.resources.empConfig;
import me.resources.stdConfig;

public class Main {
	public static void main(String[] args) {


		ApplicationContext container = new 
				AnnotationConfigApplicationContext(stdConfig.class);
		
		Student std = (Student) container.getBean("stdd");
		std.display();
		
	}
}
