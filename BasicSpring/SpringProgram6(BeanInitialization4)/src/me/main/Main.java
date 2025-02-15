package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

// here we add new jar file java annotation jar file and also added context schema
// we create a method name anything
// and we put @postconstructor in this so that spring will recognise the method and 
// initialize the bean
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
	}
}
