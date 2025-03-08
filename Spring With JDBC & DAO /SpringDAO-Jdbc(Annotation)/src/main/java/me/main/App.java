package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Student;
import me.resources.SpringConfig;
import me.service.StudentServicee;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(22);
		student.setMarks(78);
		student.setNameString("HULULU");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		StudentServicee servicee = context.getBean(StudentServicee.class);

		boolean status = servicee.addStudentService(student);
		if(status) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
}
