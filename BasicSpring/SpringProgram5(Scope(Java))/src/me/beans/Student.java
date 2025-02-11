package me.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stdd")
public class Student{
	
	@Value("Piyush")
	private String name;
	
	@Value("99")
	private int marks;
	
	
	
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
		System.out.println("Name "+name);
		System.out.println("Marks "+ marks);
	}
	
}
