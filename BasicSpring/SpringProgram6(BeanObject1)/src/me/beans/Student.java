package me.beans;

import org.springframework.stereotype.Component;
// using no parameter constructor we can create the bean object 
@Component
public class Student {
	private String name;
	private int marks;
	
//	Beann object is created in this when the program have default construter
//	 or no parameter constructor
	public Student() {
		System.out.println("Constructor Called");
	}
	
//	In this our bean object will not created beacuse spring will not able to pass any
//	value to the parameterised constructor, so constructor is not called so 
//	 bean object will also created and it give error
//	public Student(int a) {
//		System.out.println("parameterised constructor");
//	}
	
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
