package me.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// run method is a static method 
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		System.out.println("Spring boot app started");
		SpringApplication.run(Main.class,args);
		System.out.println("Spring boot app closed");
	}
}
// spring.main.web-application-type=none ye wala cheex hum application properteis mein 
// provide kr denge to wo server ko start nhi karega bina server ko start kiye wo execute hoga.