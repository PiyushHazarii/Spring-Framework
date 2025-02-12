package me.beans;

import org.springframework.stereotype.Component;
// using instance factory method we can create the object
@Component
public class Student {
	
	private String name;
	private int marks;
	
	public Student(int a) {
		System.out.println("Parameterised Constructor called and bean object Created");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Hello");
	}
	

}
