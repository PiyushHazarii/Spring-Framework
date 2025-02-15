package me.beans;

public class Student {
	private String name;
	private String id;
	private Address address;
	
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
