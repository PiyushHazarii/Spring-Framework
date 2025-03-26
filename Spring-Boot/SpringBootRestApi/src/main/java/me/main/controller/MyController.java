package me.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.main.beans.Student;

// it is not possible to get these two request from the browser so that for this issue
// we use postman or insomia to get these type of request....
//@RestController
//public class MyController {
//	
//	@GetMapping("/")
//	public String printHello() {
//		return "Hello Piyush";
//	}
//	
//	@PostMapping("/")
//	public String printHi() {
//		return "Hii Piyush";
//	}
//}


// put mapping mein agar student ka id pehele se exist krta haoga to wo update karwa dega and 
// agar pehele se exist nhi kr raha hoga then wo usko add krwa dega

@RestController
public class MyController {

	// ismne hum postman se direct bhejenge data in the form of key value and yaha pr
	// hum request param se wo data le lega and wo phir print kar dega...
    @PostMapping("/")
    public String printHello(@RequestParam("name1") String name) {
        return "hello : " + name;
    }
    
    @GetMapping("/hi")
    public String printHi(@RequestParam("name1") String name) {
        return "hi : " + name;
    }
    
    // ye karne se humko path mein hi value de dena hota hai means wo uri mein  
    @GetMapping("/hello/{name1}")
    public String printHell(@PathVariable("name1") String name) {
        return "hello : " + name;
    }
    
    
    // ye json ke format mein data send karega 
   @GetMapping("/student")
    public Student studentObj() {
    	Student student = new Student();
    	student.setCity("Dhanbad");
    	student.setName("Piyush");
    	student.setGender("Male");
    	return student;
    }
}
