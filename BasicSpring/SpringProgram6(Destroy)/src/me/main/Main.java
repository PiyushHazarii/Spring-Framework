package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

// here we cannot create property method to initialize the value rather than
// we create a method in Student class that intialize the value and we 
// provide the value to the init-mehtod and it will run smoothly
public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
		
		context.registerShutdownHook();
	}
}
