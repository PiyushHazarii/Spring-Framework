package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

// bean initialization matlab usme value kaise daal rahe hai hum isme hum
// property tag ka use karke jaise normal daalte hai waise daal rahe hai
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		student.display();	
	}
}
