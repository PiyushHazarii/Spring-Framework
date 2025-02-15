package me.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

// here we use two implements methods InitializingBean, DisposableBean so that 
// InitializingBean is initialize the value and the DisposableBean is used for
// destroying the bean 
public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
		
		context.registerShutdownHook();
	}
}
