package me.beans;

public class Address {
	public Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void addDisplay() {
		System.out.println(" In Address class "+student);
	}
}
