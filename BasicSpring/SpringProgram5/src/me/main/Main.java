package me.main;

import java.awt.Adjustable;
import java.awt.image.Kernel;
import java.beans.XMLDecoder;
import java.beans.beancontext.BeanContext;
import java.io.PushbackReader;
import java.net.Authenticator;
import java.time.Year;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;

import me.beans.Employee;
import me.beans.Student;

public class Main {
	public static void main(String[] args) {

//		when we have multiple XML file then we have separate it with a comma(,)
//		and get multiple beans
		ApplicationContext container = new 
				ClassPathXmlApplicationContext("me/resources/applicationContext.xml",
						"/me/resources/employeeContext.xml");
		
		Student std = (Student) container.getBean("stdd");
		std.display();
		
		System.out.println(">>>>>>>>>>>>>>After That<<<<<<<<<<<<<");
		Employee emp = (Employee) container.getBean("emp");
		emp.employeeDisplay();
	}
}
