package me.beans;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean{
	
	private String name;
	private int marks;

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}
	
	public void intializeObject() {
		name = "Sanju";
		marks = 99;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		name = "Naman";
		marks = 89;
	}


}
