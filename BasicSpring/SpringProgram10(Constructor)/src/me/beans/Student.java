package me.beans;


public class Student {
	private String name;
	
	// galti se id string mein ho gaya hai usse koi dikkat nhi hai bus likh rahe hai
	private String id;
	private Address address;
	
	public Student(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Address :"+address);
	}
	
}
