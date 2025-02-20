 package me.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int rollno;
	private float marks;
	@Autowired
	private Address address;
	
	public Student(@Value("Piysuh") String name,@Value("115") int rollno,@Value("92.3")float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;		
	}
	
	public void display() {
		System.out.println("Name "+name);
		System.out.println("rollno "+rollno);
		System.out.println("Marks "+marks);
		System.out.println("Address "+address);
	}
	 
}
