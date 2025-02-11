package me.beans;

public class Student{
	
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
		System.out.println("Marks "+ marks);
	}
	
}
