package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new 
    			ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
    	Student student = (Student) context.getBean("std");
    	student.display();
	}
}
