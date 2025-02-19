package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Address;
import me.beans.Student;

// in this we can achieve circular dependency that can only be achieved with 
// setter based dependency because object are created earlier matlab 
// object create ho jata hai pehele kyuki isme default constructor call ho raha hai 
// and wo  object creation ka kaam kr raha hai.
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("stdId");
		student.stdDisplay();
		
		System.out.println("======================================");
		
		Address address = (Address) context.getBean("addId");
		address.addDisplay();
	}
}
