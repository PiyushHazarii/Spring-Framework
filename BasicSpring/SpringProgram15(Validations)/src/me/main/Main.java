package me.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import me.beans.Student;
import me.validators.StudentValidation;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		
		// here we use databinder that is used only for binding the data not validate the data
		// validator is responsible for validate the data 
		DataBinder dataBinder = new DataBinder(student);
		dataBinder.addValidators(new StudentValidation());
		dataBinder.validate();
		
		 List<ObjectError> list = dataBinder.getBindingResult().getAllErrors();
		 System.out.println(list);
				
				
	}
}
