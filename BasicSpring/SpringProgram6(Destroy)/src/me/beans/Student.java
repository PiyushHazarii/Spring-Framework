package me.beans;


public class Student {
	
	private String name;
	private int marks;

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}
	
	public void intializeObject() {
		System.out.println("Initialize method invoked");
		name = "Sanju";
		marks = 99;
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method invoked");
		name ="";
		marks =0;
	}

}
