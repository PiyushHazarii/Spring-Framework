package me.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String openIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String openLogin() {
		return "login";
	}
}
