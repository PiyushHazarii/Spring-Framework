package me.beans;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std_table")
public class Student {
	// hibernate ke andar humko primary key lena zarurai hai nhi to wo error dega
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // isse auto generate ho jayega value pk ka
	@Column(name="PK")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="marks")
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

}
