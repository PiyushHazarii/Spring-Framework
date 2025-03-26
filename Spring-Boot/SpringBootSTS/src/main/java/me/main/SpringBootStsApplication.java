package me.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStsApplication {

	public static void main(String[] args) {
		System.out.println("Project Started");
		SpringApplication.run(SpringBootStsApplication.class, args);
		System.out.println("Project closed");
	}

}
