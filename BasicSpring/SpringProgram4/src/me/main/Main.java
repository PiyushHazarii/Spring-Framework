package me.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Student;
import me.resources.SpringConfig;

//JAVA CONFIGURATION USED IN THIS 
//JAVA CONFIGURATION USED IN THIS 
//JAVA CONFIGURATION USED IN THIS 
//JAVA CONFIGURATION USED IN THIS 
public class Main {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		 We have to get The bean from stddd that is The bean name
		Student std = (Student) container.getBean("stddd");
		std.display();
	}
}
