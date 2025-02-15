package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

// here we can implement initializing bean method that has afterPropertiesSet method
// and here we set the value and it will automatically call we dont need to call this method 
// nad this method will set the value 
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
	}
}
