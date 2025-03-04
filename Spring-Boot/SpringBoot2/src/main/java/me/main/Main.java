package me.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this is desktop application 
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		System.out.println("Spring Boot started");
		SpringApplication.run(Main.class, args);
		System.out.println("Spring boot closed");
	}
}

// agar application proeprties mein hum spring.main.web-application-type=none
// to wo server ko start nhi karega bina server start kiye wo application ko start kr dega.