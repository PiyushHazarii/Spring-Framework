package me.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import me.std.Student;

//XML CONFIGURATION USED IN THIS LATER WE USE JAVA AND ANNOTATION CONFIGURATION
//XML CONFIGURATION USED IN THIS LATER WE USE JAVA AND ANNOTATION CONFIGURATION
//XML CONFIGURATION USED IN THIS LATER WE USE JAVA AND ANNOTATION CONFIGURATION
//XML CONFIGURATION USED IN THIS LATER WE USE JAVA AND ANNOTATION CONFIGURATION
public class Main {
	public static void main(String[] args) {
		// notes mein sab hai ss mein
		
		Resource resource = new ClassPathResource("me/resources/applicationContext.xml");
		
//		this show cut mark to The XmlBeanFactory because this is depricated 
 		BeanFactory container = new XmlBeanFactory(resource);
 		
// 		jab bhi getbean method call hota hai to hi object banta hai class ka 
		Student std = (Student) container.getBean("std");
		std.display();
	}
}
