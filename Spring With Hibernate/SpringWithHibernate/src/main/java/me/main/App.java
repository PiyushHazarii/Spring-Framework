package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.beans.Student;
import me.dao.StudentDAO;

// basically iss code mein sara cheez sahi hai lekin code compaitaibility sahi nhi pom file mein
// uske wajah se run nhi ho raha hai lec 6 hai ye   

// and haan java config wala bhi ss hai
public class App {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Piyushhh");
		student.setAge(22);
		student.setMarks(98);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");

		StudentDAO studentDAO = context.getBean(StudentDAO.class);
		studentDAO.addStdDetails(student);
		
	}
}
