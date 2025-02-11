package me.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component  // isme same name lega student hi
@Component("stud") // then ye jo hum name daalenge wo hi lega 
public class Student{
	
	@Value("Piyush")
	private String name;
	
	@Value("33")
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
