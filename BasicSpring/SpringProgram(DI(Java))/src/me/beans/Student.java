package me.beans;

public class Student {
	private String name;
	private int rollno;
	private float marks;
	private Address address;
	
	

	public Student(String name, int rollno,float marks, Address address) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.address = address;
	}
	



		public void display() {
		System.out.println("Name "+name);
		System.out.println("rollno "+rollno);
		System.out.println("Marks "+marks);
		System.out.println("Address "+address);
	}
	 
}
