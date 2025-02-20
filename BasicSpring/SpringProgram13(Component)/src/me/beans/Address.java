package me.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String addName;
	private int houseNo;
	private String city;
	
	
	public Address(@Value("Sukhi Bhawan")String addName, @Value("007")int houseNo, @Value("Dhanbad")String city){
		this.addName = addName;
		this.houseNo = houseNo;
		this.city = city;
	}
	@Override
	public String toString() {
		return "#"+houseNo+","+addName+","+city;
	}	
	
}
