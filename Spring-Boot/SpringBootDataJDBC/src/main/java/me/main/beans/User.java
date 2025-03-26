package me.main.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

public class User implements Persistable<String>{
	public static boolean is_new=false;
	
	private String name;
	@Id
	private String email;

	private String gender;
	private String city;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	// these are the implemented methods 
	@Override
	public String getId() {
		
		return email;
	}
	@Override
	public boolean isNew() {
		
		return is_new;
	}
	
}
