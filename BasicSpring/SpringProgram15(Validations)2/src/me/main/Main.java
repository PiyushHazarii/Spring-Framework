package me.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import me.beans.Student;
import me.validators.StudentValidation;

// this is the another way to implement validation in the program basically 
// internally MapBindingResult is used in the data binder but we directly 
// used MapBindingResult 
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student student = (Student) context.getBean("std");
		
		Map<String,Object> map = new HashMap<String, Object>();
		MapBindingResult mapBindingResult = new MapBindingResult(map, "mymapobj");
		
		StudentValidation studentValidation = (StudentValidation) context.getBean("stdValId");
		studentValidation.validate(student, mapBindingResult);
		
		List<ObjectError> list =	mapBindingResult.getAllErrors();
		
		if(list.isEmpty()) {
			student.display();
		}else {
			System.out.println(list);
		}
	}
}
