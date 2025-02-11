package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		
//		by default this class is singleton that is why we have seen the same address for
//		different times (tum kitna baar bhi object bana lo wo same address return karega)
		Student student = (Student) context.getBean("std");
		System.out.println(student);
		
		Student student2 = (Student) context.getBean("std");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("std");
		System.out.println(student3);
	}
}
