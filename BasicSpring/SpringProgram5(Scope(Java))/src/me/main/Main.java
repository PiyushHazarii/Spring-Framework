package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Employee;
import me.beans.Student;
import me.resources.empConfig;
import me.resources.stdConfig;

public class Main {
	public static void main(String[] args) {
		
//		 agar scope singleton hai to single address return karega nhi to 
//		 different object return karega 
		ApplicationContext container = new 
				AnnotationConfigApplicationContext(stdConfig.class);
		
		Student std = (Student) container.getBean("stdd");
		System.out.println(std);
		
		Student std1 = (Student) container.getBean("stdd");
		System.out.println(std1);
		
		Student std2 = (Student) container.getBean("stdd");
		System.out.println(std2);
		
		
	}
}
