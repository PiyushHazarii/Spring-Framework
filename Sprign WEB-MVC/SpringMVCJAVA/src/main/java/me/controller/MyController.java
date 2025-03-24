package me.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// all the things are correct but it doesnot run properly i dnot know why it is happening
@Controller
@ComponentScan(basePackages = "me.controller")
public class MyController{
	
	@GetMapping("/aaa")
	public String OpenHelloPage() {
		return "hello";
	}
}

// if we dont want to use tghe web , xml file then all the thing are in the screenshot 
// there are two ways to write the web xml to java 
// both the things are in the screenshot 
