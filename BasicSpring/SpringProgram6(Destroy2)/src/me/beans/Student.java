package me.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	private String name;
	private int marks;

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method invoked");
		name = "";
		marks =0;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Method invoked");
		name = "Piyush";
		marks = 95;		
	}

}
