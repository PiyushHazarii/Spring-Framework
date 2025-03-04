package me.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this is a web application 
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		System.out.println("Spring web application started");
		SpringApplication.run(Main.class, args);
		System.out.println("Spring web application closed");
	}
}
