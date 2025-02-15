package me.beans;

public class Address {
	private String addName;
	private int houseNo;
	private String city;
	
	public Address(String name, int houseNo, String city) {
		this.addName = name;
		this.houseNo = houseNo;
		this.city = city;
	}
	
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "#"+houseNo+","+addName+","+city;
	}	
	
}
