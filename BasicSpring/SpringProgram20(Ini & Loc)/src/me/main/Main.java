package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;


// yaha pr localization and internationalization achieve ho raha hai 
// figure hai ek wo dekhna hoga and 
// sabse pehele hum ResourceBundleMessageSource ka object/ beans bana rahe hai 
// jo ki ek class hai and student class mein hum MessageSource refernece bana 
// rahe hai joki ek interface hai then hum application file mein student mein
// ResourceBundleMessageSource set kr rahe hai taaki localization and internationalization 
// achieve ho ske 
public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		
		Student student = (Student) context.getBean("std");
		student.display();
	}
}
