package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.beans.Student;
import me.resources.SpringConfig;
import me.service.StudentServicee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student student = context.getBean(Student.class);

		StudentServicee servicee = context.getBean(StudentServicee.class);

		boolean status = servicee.addStudentService(student);
		if(status) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
}
