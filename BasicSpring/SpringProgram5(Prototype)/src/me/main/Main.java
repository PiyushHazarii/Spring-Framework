package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		System.out.println(student);
		
		Student student2 = (Student) context.getBean("std");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("std");
		System.out.println(student3);
	}
}
