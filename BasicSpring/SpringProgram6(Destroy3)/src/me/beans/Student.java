package me.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Student {
	
	private String name;
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
		System.out.println("Marks "+marks);
	}
	
	@PostConstruct
	public void intializeObject() {
		System.out.println("Initializing Method invoked");
		name = "Sanju";
		marks = 99;
	}
	
	@PreDestroy
	public void destroyObject() {
		System.out.println("Destroy Method invoked");
		name="";
		marks =0;	
		}


}
