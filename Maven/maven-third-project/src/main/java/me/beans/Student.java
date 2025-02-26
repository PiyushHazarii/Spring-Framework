package me.beans;

public class Student {
	private String name;
	private int id;
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(id);
	}
	
}
