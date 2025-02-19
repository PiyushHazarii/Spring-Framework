package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Student;
import me.resources.javaConfig;

// in this we use setter based dependency injection 
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new 
				AnnotationConfigApplicationContext(javaConfig.class);
		Student student = (Student) context.getBean("createStudent");
		student.display();
	}
}
