package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;
import me.resources.javaConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student student = (Student) context.getBean("std");
		student.display();
	}
}
