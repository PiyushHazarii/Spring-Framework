package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/me/resources/applicatoinContext.xml");
		
//		humko component mein na to alag se config File wagera banane ka zarurat hai
//		na hi kuch path wagera provide karne ka zarurat hai
		
		
//		sabse pehle hum isko register krwa lenge taaki spring uska object bana paye and
//		phir refresh krwana bhi zaruri hai then phir hum le skte hai value spring se
// 		context.register(Student.class);
//		context.refresh();
		
//		yaha pr sirf first Character hi small hoga getbean mein
		Student student = (Student) context.getBean("stud");
		student.display();
		}
}
