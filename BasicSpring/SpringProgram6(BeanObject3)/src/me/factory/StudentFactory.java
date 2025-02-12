package me.factory;

import me.beans.Student;

public class StudentFactory {
	
	public Student studentObj() {
		System.out.println("Factory method invoked");
		Student student = new Student(10);	
		return student;
	}
}
