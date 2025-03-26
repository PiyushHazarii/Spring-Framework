package me.main.beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//	@GeneratedValue(strategy = GenerationType.AUTO) // agar ye nhi denge to hum alag se
//form mein id provide krna hoga to wo jayega sql mein then add hoga kyuki wo default mein 0 mein 
// 1 form add kr chuka hoga then means ya to humko bhadana hoga usko form mein add krke nhi to
// ye upar wala annotation lagana hoga bhai....
import jakarta.persistence.Table;

@Entity
@Table(name = "std") // agar ye daal denge to wo table bhi khud se generate karega hunlog ko 
// pehele se table banane ki zarurat nhi hai.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "idd")  
	private int id;
	private String name;
	private String email;
	private String gender;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
}
