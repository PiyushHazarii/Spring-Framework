package me.beans;

import org.springframework.stereotype.Component;
// using static factory method we can create the object
@Component
public class Student {
	
	private String name;
	private int marks;
	
//	 agar parameterised constructor rahega to static factory method se usko call krwa 
//	 skte hai and jab wo constructor call hoga to automatically bean object ban jayeba
//	bus ek cheez aur krna hai ki xml file mein factory method lagake name daal dena hai bus.
	public Student(int a) {
		System.out.println("Parameterised Constructor Called and Created bean object");
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
	
//	this is  static factory method and we dont have to create the object because it is static
	public static Student studentObject() {
		System.out.println("Static factory method");
		return new Student(10);
	}

}
