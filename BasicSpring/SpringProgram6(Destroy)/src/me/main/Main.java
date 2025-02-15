package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;


// here we use a method name destroy that destroy the bean and we use 
//AbstractApplicationContext and we call context.registerShutdownHook(); this 
// method call destroy method and we also put the destroy-method in the application.xml file
// so then our destroy method will invoked 
public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
		
		context.registerShutdownHook();
	}
}
