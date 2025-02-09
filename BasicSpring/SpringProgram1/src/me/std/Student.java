package me.std;

public class Student {
	
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setter Name");
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("Setter Roll");
		this.roll = roll;
	}
	public void display() {
		System.out.println("Name "+name);
		System.out.println("Roll "+roll);
	}
}
