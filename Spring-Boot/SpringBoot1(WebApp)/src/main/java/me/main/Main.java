package me.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// agar web app ki taraah use krna hai spring boot ko to ek extra dependancy add
// krna hoga jasper according to the tomcat version that your system has.
// agar wo add nhi karwayenge to wo download kr dega jo bhi page hum add karenge to 
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}
}
