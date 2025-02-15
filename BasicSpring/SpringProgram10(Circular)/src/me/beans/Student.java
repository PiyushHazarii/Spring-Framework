package me.beans;


public class Student {
	public Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void stdDisplay() {
		System.out.println(" In Student Class "+address);
	}
	
}
