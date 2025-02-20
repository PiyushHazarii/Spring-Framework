package me.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import me.beans.Student;
import me.resources.javaConfig;
import me.validators.StudentValidation;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new 
				AnnotationConfigApplicationContext(javaConfig.class);
		Student student = (Student) context.getBean("crStudent");
		
		DataBinder dataBinder = new DataBinder(student);
		dataBinder.addValidators(new StudentValidation());
		dataBinder.validate();
		
		 List<ObjectError> list = dataBinder.getBindingResult().getAllErrors();
		 
		 // agar list mein kuch error nhi aaya to iska matlab wo empty hai to wo display 
		 // method ko call kr dega 
		 if(list.isEmpty()) {
			student.display();
		 }else {
			 System.out.println(list);
		 }
				
				
	}
}
