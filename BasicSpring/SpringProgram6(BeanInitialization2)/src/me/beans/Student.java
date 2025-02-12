package me.beans;


public class Student {
	
	private String name;
	private int marks;

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}
	
	public void intializeObject() {
		name = "Sanju";
		marks = 99;
	}


}
