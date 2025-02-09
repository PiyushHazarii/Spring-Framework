package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/me/resources/applicationContext.xml");
		Student student1 = (Student)container.getBean("std1");
		
		System.out.println("=======================std1======================");
		student1.display();
		System.out.println("=======================std1======================");
		
		Student student2 = (Student)container.getBean("std2");
		
		System.out.println("=======================std2======================");
		student2.display();
		System.out.println("=======================std2======================");
		
	}
}
